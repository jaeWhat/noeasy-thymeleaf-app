package com.noeasy.model.common.mapper;

import com.noeasy.jpa.entity.common.CommonCodeEntity;
import com.noeasy.model.common.CommonCodeDto;

public class CommonCodeMapper {
	// Entity → DTO
	public static CommonCodeDto toDto(CommonCodeEntity entity) {
		if (entity == null) {
			return null;
		}

		CommonCodeDto dto = new CommonCodeDto();
		dto.setId(entity.getId());
		dto.setCommCodeGroup(entity.getCommCodeGroup());
		dto.setCommCode(entity.getCommCode());
		dto.setCommName(entity.getCommName());
		dto.setSortSeq(entity.getSortSeq());
		dto.setUseFlag(entity.getUseFlag());
		return dto;
	}

	// DTO → Entity
	public static CommonCodeEntity toEntity(CommonCodeDto dto) {
		if (dto == null) {
			return null;
		}

		CommonCodeEntity entity = new CommonCodeEntity();
		entity.setId(dto.getId());
		entity.setCommCodeGroup(dto.getCommCodeGroup());
		entity.setCommCode(dto.getCommCode());
		entity.setCommName(dto.getCommName());
		entity.setSortSeq(dto.getSortSeq());
		entity.setUseFlag(dto.getUseFlag());
		return entity;
	}

	// DTO → Entity
	public static void updateEntityFromDto(CommonCodeDto dto, CommonCodeEntity entity) {
		entity.setId(dto.getId());
		entity.setCommCode(dto.getCommCode());
		entity.setCommName(dto.getCommName());
		entity.setCommCodeGroup(dto.getCommCodeGroup());
		entity.setSortSeq(dto.getSortSeq());
		entity.setUseFlag(dto.getUseFlag());
	}
}