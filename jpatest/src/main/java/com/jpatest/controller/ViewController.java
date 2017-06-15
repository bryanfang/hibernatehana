package com.jpatest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jpatest.model.Test;
import com.jpatest.repository.TestRepository;

@RestController
public class ViewController {
	
	@Autowired
	private TestRepository resp;
	
	@GetMapping("/")
	public List<Test> getAllView(){
		return resp.findAll();
	}
}
