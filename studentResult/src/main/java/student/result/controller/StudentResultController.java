package student.result.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import student.result.entity.MarkSheet;
import student.result.entity.Results;
import student.result.entity.Student;
import student.result.service.StudentResultServicre;

@RestController
@RequestMapping(value = "results")

public class StudentResultController {
	@Autowired StudentResultServicre stures;
	@Autowired
	RestTemplate rest;
	
	@PostMapping(value = "/number")
	
	public String insertData(@RequestBody Results sr) {
		String url = "http://localhost:8083/student/findid/";
		ResponseEntity<Student> obj = rest.exchange(url+sr.getRoolNumber(),
				          HttpMethod.GET,null,Student.class);
		Student input = obj.getBody();
		
		String url1 = "http://localhost:8082/marksheet/findbyroll/";
		ResponseEntity<MarkSheet> obj1 = rest.exchange(url1+sr.getRoolNumber(),
				          HttpMethod.GET,null,MarkSheet.class);
		MarkSheet input1 = obj1.getBody();
		
		sr.setName(input.getName());
		int total = 0;
		
		if(input.getAttendance()>90) {
			
		total =(input1.getSem1total()+input1.getSem2total())+5;
		sr.setTotalMarks(total);
		
		}
		else {
			total =(input1.getSem2total()+input1.getSem2total());
			sr.setTotalMarks(total);
			
		}
		
		return stures.insertData(sr);
		
		
		
	} 

}
