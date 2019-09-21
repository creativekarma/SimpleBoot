package com.creativekarma.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class WelcomeController {
	@GetMapping("/getName")
	public String getResponse(@RequestParam("name") String name) {
		log.debug("Hellooo " + name);
		return "Vanakkams " + name;
	}
}
