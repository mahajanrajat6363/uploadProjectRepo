package com.github.example.githubuploaddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/upload")
public class UploadDemoController {

	@GetMapping("/demo")
	public String uploadDemo() {
		return "Hi SUccessful Uplaod demo";
	}
}
