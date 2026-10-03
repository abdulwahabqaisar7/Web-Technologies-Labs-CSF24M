public class Employee{
	private String firstName, lastName, SSN;
	// Three parameterized constructor
	Employee(String fname,String lname,String ssn){
		setFName(fname);
		setLName(lname);
		setSSN(ssn);
	}
	//Setters
	public void setFName(String name){
		firstName = name;
	}
	public void setLName(String name){
		lastName = name;
	}
	public void setSSN(String ssn){
		SSN = ssn;
	}
	//Getters
	public String getFName(){
		return firstName;
	}
	public String getLName(){
		return lastName;
	}
	public String getssn(){
		return SSN;
	}
	
	public String toString(){
		String fName = "First Name: " + getFName() + '\n';
		String lName = "Last Name: " + getLName() + '\n';
		String SN = "Social Security Number: " + getssn();
		return fName + lName + SN;
	}
	double earning(){
		return 0.0;
	}
}