package com.nfp.springtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {
	
	@GetMapping("/")
	public String inicio() {
		return "Hola mundo con Spring NFP";
	}
}