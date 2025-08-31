package com.noeasy.controller.api.common;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.noeasy.model.common.CommonCodeDto;

@RequestMapping("/api/common/code")
public interface CommonCodeController {

	@GetMapping
	ResponseEntity<List<CommonCodeDto>> getCodes(CommonCodeDto input);

	@PostMapping
	ResponseEntity<List<CommonCodeDto>> postCodes(@RequestBody List<CommonCodeDto> input);

	@PutMapping
	ResponseEntity<List<CommonCodeDto>> putCodes(@RequestBody List<CommonCodeDto> input);

	@DeleteMapping
	ResponseEntity<List<CommonCodeDto>> deleteCodes(@RequestBody List<CommonCodeDto> input);
}