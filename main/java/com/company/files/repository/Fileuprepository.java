package com.company.files.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.files.model.Fileup;

@Repository
public interface Fileuprepository extends JpaRepository<Fileup, String>{

}
