package singleRP;

public class Job {
String description;
float salary;
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public Job(String description, float salary) {
	super();
	this.description = description;
	this.salary = salary;
}


}
