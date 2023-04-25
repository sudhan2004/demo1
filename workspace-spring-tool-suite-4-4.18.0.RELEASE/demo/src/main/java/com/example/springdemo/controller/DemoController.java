package com.example.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.springdemo.db.jdbc;

import com.example.springdemo.service.DemoService;

@RestController

public class DemoController {
	@Autowired
	DemoService dservice;
	@GetMapping("/Postmsnrx/gettest")
	public List<jdbc> getValues()
	{
		List<jdbc> studlist=dservice.getAll();
		return studlist;
	}
	@PostMapping("/Postmsnrx/testingpost")
	public jdbc saveStudents(@RequestBody jdbc s)
	{
		return dservice.saveStudents(s);
	}
	@PutMapping("/Postmsnrx/testingput")
	public jdbc updateStudents(@RequestBody jdbc s)
	{
		return dservice.updateStudents(s);
	}
	@DeleteMapping("/Postmsnrx/testingdelete/{id}")
	public void deleteStudents(@PathVariable("id") int id)
	{
		dservice.deleteStudents(id);
	}
}
