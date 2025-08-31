package com.noeasy.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/")
	public String indexPage() {
		return "index";
	}

	@GetMapping("/comm/code")
	public String CommCodePage() {
		return "pages/common/codeList";
	}

	@GetMapping("/about")
	public String aboutPage() {
		return "pages/about";
	}
}