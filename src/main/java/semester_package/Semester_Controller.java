package semester_package;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Semester_Controller {

	@Autowired
	private Semester_Service semService;
	
	@RequestMapping("/sem/{id}")
	public Semester get(@PathVariable("id") int id){
		return semService.select(id);
	}
	
	@RequestMapping("/sem")
	public ArrayList<Semester> getAll(){
		return semService.selectAll();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/sem")
	public String post(@RequestBody Semester se){
		return semService.insert(se);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/sem/{id}")
	public String put(@PathVariable("id") int id,@RequestBody Semester se){
		return semService.update(id,se);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/sem/{id}")
	public String delete(@PathVariable("id") int id){
		return semService.delete(id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/sem")
	public String deleteAll(){
		return semService.deleteAll();
	}
}


