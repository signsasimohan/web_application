package com.example.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

	
	@Query(value = "select * from student_details.student where rool_number=?;",nativeQuery = true)
	public Student getbyroll(int roll);

}
