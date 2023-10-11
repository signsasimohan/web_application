package student.mark.sheet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.student.entity.Student;

import student.mark.sheet.entity.MarkSheet;
import student.mark.sheet.service.StudentMarkSheetService;

@RestController
@RequestMapping(value = "/marksheet")
public class StudentMarkSheetController {
	@Autowired
    StudentMarkSheetService marSer;
	
	@PostMapping(value = "/mark")
	public MarkSheet createMark(@RequestBody MarkSheet markSheet) {
		
		return marSer.createMarkSheet(markSheet);
	}
	
	@GetMapping(value = "/findbyroll/{id}")
	
	 public MarkSheet findId(@PathVariable int id) {
		
		return marSer.findId(id);
	
}
}