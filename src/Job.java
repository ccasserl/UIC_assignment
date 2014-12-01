import java.util.Date;
import java.util.List;


public class Job {
	
	public int id;  //unique ID number generated automatically for the job
	public String title;
	public String description;
	public Date start_date;
	public Date end_date;
	public List<Skill> requirements;
	
	public Job(int id, String title){
		this.id = id;
		this.title = title;
	}
	
	public void addDescription(String description){
		this.description = description;
	} 
	
	public void addSkill(Skill new_requirement){
		this.requirements.add(new_requirement);
	}

}
