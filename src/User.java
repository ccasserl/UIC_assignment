import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Three different user types that extend the class User: Applicant, Employer and Admin */

public class User {
	
	public String username; // has to be unique for the user, used when logging in
	public String password;
	public String name; // Real name (/display name)
	
	
	public User(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}

}



class Applicant extends User {
	
	public Date date_of_birth;
	public String description;
	public Map<String, Skill> skills = new HashMap<String, Skill>();

	public Applicant(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}
	
	public void setDescription(String description){
		this.description = description;
	} 
	public String getDescription(){
		return this.description;
	}
	
	public void addSkill(Skill new_skill){
		this.skills.put(new_skill.name, new_skill);
	}
	
	public Skill getSkill(String skill_name){
		return this.skills.get(skill_name);
	}
	
	public void removeSkill(String skill_name){
		this.skills.remove(skill_name);
	}
	
	
}



class Employer extends User{
	
	public String company;
	public Map<Integer, Job> jobs = new HashMap<Integer, Job>();

	public Employer(String username, String password, String company) {
		super(username, password);
		this.company = company;
	}
	
	public void addJob(Job new_job){
		this.jobs.put(new_job.id, new_job);
	}
	
	public Job getJob(int job_id){
		return this.jobs.get(job_id);
	}
	
	public void removeJob(int job_id ){
		this.jobs.remove(job_id);
	}
	
}



class Admin extends User{

	public Admin(String username, String password) { // TODO does admin need more member?
		super(username, password);
	}
	
}

