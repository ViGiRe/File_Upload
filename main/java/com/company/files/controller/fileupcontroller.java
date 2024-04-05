package com.company.files.controller;

import java.io.IOException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.company.files.model.Fileup;
import com.company.files.serviceimpl.Fileupservice;

@RestController
@RequestMapping("file")
public class fileupcontroller {
	@Autowired
	Fileupservice fileupservice;
	
	@PostMapping
	public Fileup uploadfile(@RequestParam("file") MultipartFile file) throws IOException {
	
		return fileupservice.store(file);
		
	}
	
	@GetMapping("/{id}")
	public Fileup getbyid(@PathVariable String id) {
		
		
		return fileupservice.getfindbyid(id);
		
	}
	
	@GetMapping("/list")
	public List<Fileup> getfilelist(){
		
		return fileupservice.getfilelist();
		
	}
	

}
