package Program5;

public class Venue {
  private String name;
  private String city;
public Venue() {
	super();
	// TODO Auto-generated constructor stub
}
public Venue(String name, String city) {
	super();
	this.name = name;
	this.city = city;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Venue Details :\n"+"Venue name:" + name + "\ncity name:" + city;
	//System.out.println( "Venue Details:");
	//System.out.println("Venue Name :"+name);
	//System.out.println("CityName Name :"+n);

}
  
}
