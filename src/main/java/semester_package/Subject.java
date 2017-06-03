package semester_package;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Subject {

	@Id
	private int subjNumber;
	private String name;
	
	@ManyToOne
	private Semester sem;

	public Subject() {
		super();
	}

	public Subject(int subjNumber, String name, Semester sem) {
		super();
		this.subjNumber = subjNumber;
		this.name = name;
		this.sem = sem;
	}

	public int getSubjNumber() {
		return subjNumber;
	}

	public void setSubjNumber(int subjNumber) {
		this.subjNumber = subjNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Semester getSem() {
		return sem;
	}

	public void setSem(Semester sem) {
		this.sem = sem;
	}
	
	
	
}
