public class SalariedEmployee extends Employee{
	private double weeklySalary;
	SalariedEmployee(String fname, String lname, String ssn, double weeklySalary){
		super(fname, lname, ssn);
		setWeeklySalary(weeklySalary);
	}
	//Setter
	public void setWeeklySalary(double sal){
		weeklySalary = sal;
	}
	//Getter
	public double getWeeklySalary(){
		return weeklySalary;
	}
	public String toString(){
		String SUPER = super.toString();
		String Sal = "\nWeekly Salary: " + getWeeklySalary();
		return SUPER + Sal;
	}
	double earning(){
		return getWeeklySalary();
	}
}