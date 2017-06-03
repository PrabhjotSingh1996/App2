package semester_package;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Semester {

	@Id
	private int number;
	private double fees;
	public Semester() {
		super();
	}
	public Semester(int number, double fees) {
		super();
		this.number = number;
		this.fees = fees;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	
}
