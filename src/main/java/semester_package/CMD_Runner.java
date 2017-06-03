package semester_package;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CMD_Runner implements CommandLineRunner {

	@Autowired
	private SemQuery semQuery1;
	@Autowired
	private SubQuery subQuery1;
	
	@Override
	public void run(String... arg0) throws Exception {
		semQuery1.save(new Semester(1,10000));
		semQuery1.save(new Semester(2,20000));
		semQuery1.save(new Semester(3,30000));
		subQuery1.save(new Subject(101,"1-a",new Semester(1,10000)));
		subQuery1.save(new Subject(102,"1-b",new Semester(1,10000)));
		subQuery1.save(new Subject(103,"1-c",new Semester(1,10000)));
		subQuery1.save(new Subject(201,"2-a",new Semester(2,20000)));
		subQuery1.save(new Subject(202,"2-b",new Semester(2,20000)));
		subQuery1.save(new Subject(203,"2-c",new Semester(2,20000)));
		subQuery1.save(new Subject(301,"3-a",new Semester(3,30000)));
		subQuery1.save(new Subject(302,"3-b",new Semester(3,30000)));
		subQuery1.save(new Subject(303,"3-c",new Semester(3,30000)));
	}
}
