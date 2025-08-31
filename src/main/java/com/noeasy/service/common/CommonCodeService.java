package com.noeasy.service.common;

import java.util.List;

import com.noeasy.model.common.CommonCodeDto;

public interface CommonCodeService {

	List<CommonCodeDto> selectCodes(CommonCodeDto input);

	List<CommonCodeDto> insertCodes(List<CommonCodeDto> input);

	List<CommonCodeDto> updateCodes(List<CommonCodeDto> input);

	List<CommonCodeDto> deleteCodes(List<CommonCodeDto> input);
}