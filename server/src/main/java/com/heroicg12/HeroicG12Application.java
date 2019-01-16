package com.heroicg12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@SpringBootApplication
public class HeroicG12Application {

	public static void main(String[] args) {
		SpringApplication.run(HeroicG12Application.class, args);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<String> getById(@PathVariable String id) {
		return new ResponseEntity<String> ("GET Response: " + id, HttpStatus.OK);
	}

}

