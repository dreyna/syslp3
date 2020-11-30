package com.syslp3.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syslp3.service.RolService;

@RestController
public class HomeController {
@Autowired
private RolService rolService;
	@GetMapping("/")
	public List<Map<String, Object>> mensaje() {
		return rolService.readAll();
	}
}
