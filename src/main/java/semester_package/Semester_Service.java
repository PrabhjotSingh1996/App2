package semester_package;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Semester_Service {

	@Autowired
	private SemQuery semQuery;
	
	public Semester select(int id){
		return semQuery.findOne(id);
	}
	
	public ArrayList<Semester> selectAll(){
		ArrayList<Semester> list = new ArrayList<>();
		semQuery.findAll().forEach(t->list.add(t));
		return list;
	}
	
	public String insert(Semester s){
		semQuery.save(s);
		return "inserted";
	}
	
	public String update(int id,Semester s){
		semQuery.delete(id);
		semQuery.save(s);
		return "updated";
	}
	
	public String delete(int id){
		semQuery.delete(id);
		return "deleted";
	}
	
	public String deleteAll(){
		semQuery.deleteAll();
		return "truncated";
	}
	
}
