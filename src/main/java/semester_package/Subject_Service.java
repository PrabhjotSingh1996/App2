package semester_package;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Subject_Service {

	@Autowired
	private SubQuery subQuery;
	
	public Subject select(int id){
		return subQuery.findOne(id);
	}
	
	public ArrayList<Subject> selectAll(int id){
		return subQuery.findBySemNumber(id);
	}
	
	public String insert(Subject s){
		subQuery.save(s);
		return "inserted";
	}
	
	public String update(int id,Subject s){
		subQuery.delete(id);
		subQuery.save(s);
		return "updated";
	}
	
	public String delete(int id){
		subQuery.delete(id);
		return "deleted";
	}
	
	public String deleteAll(int id){
		subQuery.findBySemNumber(id).forEach(t->subQuery.delete(t));
		return "truncated";
	}
	
}
