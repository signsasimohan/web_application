package com.example.student.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.dao.StudentDao;
import com.example.student.entity.Student;


@Service

public class StudentService {
	@Autowired
	StudentDao stuDao;
       public String insertStudent( List<Student> e) {
		
		return stuDao.insertStudent(e);
	}
	public Student ageFind(Student e) {
	
		return stuDao.ageFind(e);
	}
	public Student getbyroll(int id) {
	
		return stuDao.getbyroll(id);
	}
	public Student updateDetail(Student e) {
		
		return stuDao.updatedetail(e);
	}
	public int delete(int id) {
		
		return stuDao.delete(id);
	}

}
