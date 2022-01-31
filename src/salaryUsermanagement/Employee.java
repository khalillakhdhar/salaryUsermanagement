package salaryUsermanagement;

public class Employee extends Person {
private String JobDescription;

public Employee(String name, String firstName, String birthdate, String jobDescription) {
	super(name, firstName, birthdate);
	JobDescription = jobDescription;
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public String getJobDescription() {
	return JobDescription;
}

public void setJobDescription(String jobDescription) {
	JobDescription = jobDescription;
}

public boolean hasGoodSalary(float salary)
{
if(salary>4000)
	return true;
else 
	return false;
}


}
