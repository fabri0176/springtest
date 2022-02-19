package com.nfp.springtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class InitController {
	
	@GetMapping("/")
	public String helloWorld() {
		log.info("Ejecutando controlador REST");
		return "Hola mundo con Spring NFP.";
	}
}