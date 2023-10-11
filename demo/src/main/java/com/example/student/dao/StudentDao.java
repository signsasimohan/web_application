package com.example.student.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;

@Repository
public class StudentDao {
	 @Autowired
	   StudentRepository stuRepo;
	   
		public String insertStudent(List<Student> e) {
		   stuRepo.saveAll(e);
		   return "Done";
	   }

		public Student ageFind(Student e) {
		
			return stuRepo.save(e);
		}

		public Student getbyroll(int id) {
			
			return stuRepo.getbyroll(id);
		}

		public Student updatedetail(Student e) {
			
			return stuRepo.save(e);
		}

		public int delete(int id) {
		
			 stuRepo.deleteById(id);
			 return 0;
		}
	

}
