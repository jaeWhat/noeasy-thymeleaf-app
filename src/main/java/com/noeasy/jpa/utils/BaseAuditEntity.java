package com.noeasy.jpa.utils;

import java.time.OffsetDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseAuditEntity {

	@CreatedDate
	@Column(name = "create_time", nullable = false, updatable = false)
	private OffsetDateTime createTime;

	@LastModifiedDate
	@Column(name = "update_time", nullable = false)
	private OffsetDateTime updateTime;

	// =======================
	// Enum for use_flag
	// =======================
	public enum UseFlag {
		Y, N
	}
}