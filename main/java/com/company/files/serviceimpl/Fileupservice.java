package com.company.files.serviceimpl;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.company.files.model.Fileup;
import com.company.files.repository.Fileuprepository;

@Service
public class Fileupservice {
	@Autowired
	Fileuprepository fileuprepo;

	public Fileup store(MultipartFile file) throws IOException {
		String filename=file.getOriginalFilename();
	
		Fileup fileup=new Fileup(UUID.randomUUID().toString(), filename, file.getContentType(), file.getBytes());
		return fileuprepo.save(fileup);
	}
	
	public Fileup getfindbyid(String id) {
		Optional<Fileup> fileup=fileuprepo.findById(id);
		
		if(fileup.isPresent()) {
			
			return fileup.get();
		}
		
		return null;
		
	}
	
	public List<Fileup> getfilelist(){
		
		return fileuprepo.findAll();
		
	}
	
}
