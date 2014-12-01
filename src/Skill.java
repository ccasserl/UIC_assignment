
public class Skill {
	
	public String name;
	public String description;
	public int level; // skill level from 1-10
	
	public Skill(String name, int type){
		this.name = name;

	}
	
	public String getName(){
		return this.name;
	}
	
	public void addDescription(String description){
		this.description = description;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public void addLevel(int skill_level){
		this.level = skill_level;
	}
	

}
