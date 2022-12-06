package com.srgplv;

import com.srgplv.service.Services;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@SpringBootApplication
public class Application {
	@Autowired
	Services services;

	@RequestMapping(value = {"", "/"})
	public void index() {
		services.handleUpload();
	}

	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
