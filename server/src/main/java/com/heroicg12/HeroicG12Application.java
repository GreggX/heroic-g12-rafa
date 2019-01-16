package com.heroicg12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;

@SpringBootApplication
public class HeroicG12Application {

	public static void main(String[] args) {
		SpringApplication.run(HeroicG12Application.class, args);
	}
}

@RestController
class Hello {

    @RequestMapping("/shit/{name}")
    public String homeInit(Model model) {
      return "Shit";
    }
}
