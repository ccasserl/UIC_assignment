import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Job {
	
	public int id;  //unique ID number generated automatically for the job
	public String title;
	public String description;
	public Date start_date;
	public Date end_date;
	public Map<String, Skill> requirements = new HashMap<String, Skill>(); // TODO Keep this? not necessary, can also be just listed in description
	
	public Job(int id, String title){
		this.id = id;
		this.title = title;
	}
	
	public void addDescription(String description){
		this.description = description;
	} 
	
	public void addRequirement(Skill new_requirement){
		this.requirements.put(new_requirement.name, new_requirement);
	}
	
	public Skill getRequirement(String requirement_name){
		return this.requirements.get(requirement_name);
	}
	
	public void removeRequirement(String requirement_name){
		this.requirements.remove(requirement_name);
	}
	

}
