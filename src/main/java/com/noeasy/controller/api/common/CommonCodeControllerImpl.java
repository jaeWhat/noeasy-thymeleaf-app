package com.noeasy.controller.api.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.noeasy.model.common.CommonCodeDto;
import com.noeasy.service.common.CommonCodeService;

@RestController
public class CommonCodeControllerImpl implements CommonCodeController {

	@Autowired
	private CommonCodeService commCodeService;

	@Override
	public ResponseEntity<List<CommonCodeDto>> getCodes(CommonCodeDto input) {
		return ResponseEntity.ok(commCodeService.selectCodes(input));
	}

	@Override
	public ResponseEntity<List<CommonCodeDto>> postCodes(@RequestBody List<CommonCodeDto> input) {
		return ResponseEntity.ok(commCodeService.insertCodes(input));
	}

	@Override
	public ResponseEntity<List<CommonCodeDto>> putCodes(@RequestBody List<CommonCodeDto> input) {
		return ResponseEntity.ok(commCodeService.updateCodes(input));
	}

	@Override
	public ResponseEntity<List<CommonCodeDto>> deleteCodes(@RequestBody List<CommonCodeDto> input) {
		return ResponseEntity.ok(commCodeService.deleteCodes(input));
	}
}