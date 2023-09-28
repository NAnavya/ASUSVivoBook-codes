package program4;

public class Player {
    private String name;
    private String country;
    private String skill;
	public Player(String name, String country, String skill) {
		super();
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public void split() {
		System.out.println( "Player Details:");
		System.out.println("Player Name :"+name);
		System.out.println("Country Name :"+country);
		System.out.println("Skill :"+skill);
	}
    
}
