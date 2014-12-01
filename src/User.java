import java.util.Date;
import java.util.List;

/* Three different user types: potential Employee, Employer and Admin */

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



class Employee extends User {
	
	public Date date_of_birth;
	public String description;
	public List<Skill> skills;

	public Employee(String username, String password) {
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
		this.skills.add(new_skill);
	}
	
	public List<Skill> getSkills(){
		return this.skills;
	}
	
}



class Employer extends User{
	
	public String company;
	public List<Job> jobs;

	public Employer(String username, String password, String company) {
		super(username, password);
		this.company = company;
	}
	
	public void addJob(Job new_job){
		this.jobs.add(new_job);
	}
	
	public List<Job> getJobs(){
		return this.jobs;
	}
	
}



class Admin extends User{

	public Admin(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}
	
}

