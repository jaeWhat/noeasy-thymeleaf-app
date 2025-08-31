package com.noeasy.service.common.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.noeasy.jpa.entity.common.CommonCodeEntity;
import com.noeasy.jpa.repository.common.CommonCodeRepository;
import com.noeasy.model.common.CommonCodeDto;
import com.noeasy.model.common.mapper.CommonCodeMapper;
import com.noeasy.service.common.CommonCodeService;

@Service
@Transactional
public class CommonCodeServiceImpl implements CommonCodeService {

	@Autowired
	private CommonCodeRepository commCodeRepo;

	@Override
	public List<CommonCodeDto> selectCodes(CommonCodeDto input) {
		List<CommonCodeEntity> result;

		if (input.getCommCodeGroup() != null) {
			result = commCodeRepo.findByCommCodeGroupOrderBySortSeq(input.getCommCodeGroup());
		} else {
			result = commCodeRepo.findAllByOrderByCommCodeGroupAscSortSeqAsc();
		}

		return result.stream().map(CommonCodeMapper::toDto).collect(Collectors.toList());
	}

	@Override
	public List<CommonCodeDto> insertCodes(List<CommonCodeDto> input) {
		List<CommonCodeEntity> entities = input.stream().map(CommonCodeMapper::toEntity).collect(Collectors.toList());

		List<CommonCodeEntity> saved = commCodeRepo.saveAll(entities);

		return saved.stream().map(CommonCodeMapper::toDto).collect(Collectors.toList());
	}

	@Override
	public List<CommonCodeDto> updateCodes(List<CommonCodeDto> input) {
		List<CommonCodeEntity> result = new ArrayList<>();

		for (CommonCodeDto dto : input) {
			CommonCodeEntity entity;

			if (dto.getId() != null && commCodeRepo.existsById(dto.getId())) {
				// 이미 존재 → 수정
				entity = commCodeRepo.findById(dto.getId()).orElseThrow();
				CommonCodeMapper.updateEntityFromDto(dto, entity); // 수동으로 필드 매핑
			} else {
				// 새로 추가
				entity = CommonCodeMapper.toEntity(dto);
			}

			result.add(entity);
		}

		List<CommonCodeEntity> saved = commCodeRepo.saveAll(result);
		return saved.stream().map(CommonCodeMapper::toDto).collect(Collectors.toList());
	}

	@Override
	public List<CommonCodeDto> deleteCodes(List<CommonCodeDto> input) {
		List<CommonCodeEntity> entities = input.stream().map(CommonCodeMapper::toEntity).collect(Collectors.toList());

		commCodeRepo.deleteAll(entities);

		return input;
	}
}