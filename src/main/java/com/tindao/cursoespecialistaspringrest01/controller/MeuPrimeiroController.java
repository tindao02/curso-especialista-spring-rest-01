package com.tindao.cursoespecialistaspringrest01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MeuPrimeiroController 
{
	@GetMapping
	@ResponseBody
	public String hello()
	{
		return("Hello Word!");
	}
}
