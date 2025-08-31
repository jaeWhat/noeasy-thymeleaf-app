package com.noeasy.model.common;

import java.util.UUID;

import com.noeasy.jpa.utils.BaseAuditEntity.UseFlag;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommonCodeDto {
	private UUID id;
	private String commCodeGroup;
	private String commCode;
	private String commName;
	private int sortSeq;
	private UseFlag useFlag;
}