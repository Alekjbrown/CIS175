package model;

public class NPC {
	private String name;
	private String race;
	private int age;
	private String Description;
	public NPC(String name, String race, int age, String description) {
		super();
		this.name = name;
		this.race = race;
		this.age = age;
		Description = description;
	}
	public NPC() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null) {
		this.name = name;
		} else {
			this.name = "NULL";
		}
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		if(race != null) {
		this.race = race;
		}else {
			this.race = "NULL";
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		if(description != null) {
		Description = description;
		} else {
			this.Description = "NULL";
		}
	}

	@Override
	public String toString() {
		return "NPC [name=" + name + ", race=" + race + ", age=" + age + ", Description=" + Description + "]";
	}
	
}
