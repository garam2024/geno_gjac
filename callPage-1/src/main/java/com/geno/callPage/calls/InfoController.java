package com.geno.callPage.calls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
	@GetMapping("/calls")
	public String projectInfo() {
		return "Project name is genobot";
	}
}
