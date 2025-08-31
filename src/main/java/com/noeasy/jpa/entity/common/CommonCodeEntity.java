package com.noeasy.jpa.entity.common;

import java.util.UUID;

import com.github.f4b6a3.uuid.UuidCreator;
import com.noeasy.jpa.utils.BaseAuditEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "t_comm_code")
@Getter
@Setter
@ToString
public class CommonCodeEntity extends BaseAuditEntity {

	@PrePersist
	public void generateId() {
		if (this.id == null) {
			this.id = UuidCreator.getTimeOrdered(); // UUID v7 자동 생성
		}
	}

	@Id
	@Column(name = "id", nullable = false)
	private UUID id;

	@Column(name = "comm_code_group", length = 50)
	private String commCodeGroup;

	@Column(name = "comm_code", length = 50, nullable = false)
	private String commCode;

	@Column(name = "comm_name", length = 100, nullable = false)
	private String commName;

	@Column(name = "sort_seq")
	private Integer sortSeq; // DB 트리거로 자동 증가 처리

	@Enumerated(EnumType.STRING)
	@Column(name = "use_flag", nullable = false, length = 1)
	private UseFlag useFlag = UseFlag.Y; // 기본값 Y

}
