package com.kaxeon.test2;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Test2Application {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/abc")
	String home1() {
		return "Hello ABC!";
	}
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Test2Application.class, args);
	}

}
