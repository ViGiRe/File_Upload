package com.company.files;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FileUploadApplication {

	public static void main(String[] args) {
		System.out.println("Spring boot file upload");
		SpringApplication.run(FileUploadApplication.class, args);
	}

}
