package student.result.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import student.result.entity.Results;
import student.result.repository.StudentResultRepository;

@Repository

public class StudentResultDao {
	@Autowired	StudentResultRepository stuRepo;
	
	public String insertDao(Results sr) {
		
		stuRepo.save(sr);
		
		return "Success";
	}
	

}
