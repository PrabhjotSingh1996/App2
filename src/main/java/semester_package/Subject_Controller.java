package semester_package;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Subject_Controller {

	@Autowired
	private Subject_Service subService;
	
	@RequestMapping("/sem/{id}/sub/{sid}")
	public Subject get(@PathVariable("sid") int sid){
		return subService.select(sid);
	}
	
	@RequestMapping("/sem/{id}/sub")
	public ArrayList<Subject> getAll(@PathVariable("id") int id){
		return subService.selectAll(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/sem/{semId}/sub")
	public String post(@RequestBody Subject se){
		return subService.insert(se);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/sem/{id}/sub/{sid}")
	public String put(@PathVariable("sid") int id,@RequestBody Subject se){
		return subService.update(id,se);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/sem/{id}/sub/{sid}")
	public String delete(@PathVariable("sid") int id){
		return subService.delete(id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/sem/{id}/sub")
	public String deleteAll(@PathVariable("id") int id){
		return subService.deleteAll(id);
	}
	
}
