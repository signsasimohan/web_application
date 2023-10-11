package student.mark.sheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import student.mark.sheet.entity.MarkSheet;

public interface StudentMarkSheetRepository extends JpaRepository<MarkSheet,Integer>{

@Query(value ="select * from student_mark_sheet.mark_sheet where roll_number =?;",nativeQuery = true)
public MarkSheet getbyroll(int roll);

}
