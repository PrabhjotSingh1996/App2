package semester_package;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

public interface SubQuery extends CrudRepository<Subject,Integer>{

	public ArrayList<Subject> findBySemNumber(int id);
}
