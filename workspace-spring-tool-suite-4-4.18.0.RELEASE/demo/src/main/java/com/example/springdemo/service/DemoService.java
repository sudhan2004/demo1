package com.example.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.db.jdbc;
import com.example.springdemo.repository.DemoRepository;

@Service
public class DemoService {
	@Autowired
	DemoRepository drepo;
	public List<jdbc> getAll()
	{
		List<jdbc> studlist=drepo.findAll();
		return studlist;
	}
	public jdbc saveStudents(jdbc s)
	{
		return drepo.save(s);
	}
	public jdbc updateStudents(jdbc s)
	{
		return drepo.save(s);
	}
	public void deleteStudents(int id)
	{
		drepo.deleteById(id);
	}
}
