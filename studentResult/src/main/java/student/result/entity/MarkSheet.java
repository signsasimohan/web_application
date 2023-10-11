package student.result.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mark_sheet")


public class MarkSheet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int roll_number;
	private int sem1_theory;
	private int sem1_pratical;
	private int sem2_theory;
	private int sem2_pratical;
	private int sem1_total;
	private int sem2_total;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollnumber() {
		return roll_number;
	}
	public void setRollnumber(int rollnumber) {
		this.roll_number = rollnumber;
	}
	public int getSem1theory() {
		return sem1_theory;
	}
	public void setSem1theory(int sem1theory) {
		this.sem1_theory = sem1theory;
	}
	public int getSem1pratical() {
		return sem1_pratical;
	}
	public void setSem1pratical(int sem1pratical) {
		this.sem1_pratical = sem1pratical;
	}
	public int getSem2theory() {
		return sem2_theory;
	}
	public void setSem2theory(int sem2theory) {
		this.sem2_theory = sem2theory;
	}
	public int getSem2pratical() {
		return sem2_pratical;
	}
	public void setSem2pratical(int sem2pratical) {
		this.sem2_pratical = sem2pratical;
	}
	public int getSem1total() {
		return sem1_total;
	}
	public void setSem1total(int sem1total) {
		this.sem1_total = sem1total;
	}
	public int getSem2total() {
		return sem2_total;
	}
	public void setSem2total(int sem2total) {
		this.sem2_total = sem2total;
	}
	
	
	
	
	
	
}
