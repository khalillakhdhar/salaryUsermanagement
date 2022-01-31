package salaryUsermanagement;

public class Person {
private String name,firstName,Birthdate;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getBirthdate() {
	return Birthdate;
}

public void setBirthdate(String birthdate) {
	Birthdate = birthdate;
}

public Person() {
}

public Person(String name, String firstName, String birthdate) {
	super();
	this.name = name;
	this.firstName = firstName;
	Birthdate = birthdate;
}

}
