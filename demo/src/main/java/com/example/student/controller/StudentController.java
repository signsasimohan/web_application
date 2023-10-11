package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.CustomSQLExceptionTranslatorRegistrar;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.custom.expception.CustomExceptions;
import com.example.student.entity.Student;
import com.example.student.service.StudentService;

@RestController
@RequestMapping(value = "student")

public class StudentController {
	@Autowired
	StudentService stuSer;
	
	  @PostMapping(value = "/add")
	public String insertStudent(@RequestBody List<Student> e) {
		
		return stuSer.insertStudent(e);
	}
	
	@PostMapping(value = "/age")

	public Student ageFind(@RequestBody Student e) throws CustomExceptions {
		if(e.getAge()<18) {
			throw new CustomExceptions("not eligible");
			
		}
		else {
			return stuSer.ageFind(e);
			
		}
	}
	
		@GetMapping(value = "findid/{id}")
	    public Student findId(@PathVariable int id) {
			
			return stuSer.getbyroll(id);
		}	
		@PutMapping(value="/update")
		public Student updateDetail(@RequestBody Student e) {
			
			return stuSer.updateDetail(e);
		}
		@DeleteMapping(value = "/delete/{id}")
		public int delete(@PathVariable int id) {
			
			return stuSer.delete(id);
		}
		
	}
	

