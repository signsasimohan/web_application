package student.mark.sheet.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import student.mark.sheet.entity.MarkSheet;
import student.mark.sheet.repository.StudentMarkSheetRepository;

@Service
@Repository

public class StudentMarkSheetService {
	@Autowired
	StudentMarkSheetRepository markSheetrepo;
public MarkSheet createMarkSheet(MarkSheet markSheet) {
	
	markSheet.setSem1total(markSheet.getSem1theory()+markSheet.getSem1pratical());
	markSheet.setSem2total(markSheet.getSem2theory()+markSheet.getSem2pratical());
	
	return markSheetrepo.save(markSheet);
}
public MarkSheet findId(int id) {
	
	return markSheetrepo.getbyroll(id);
}


}
	

