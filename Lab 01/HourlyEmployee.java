public class HourlyEmployee extends Employee{
	private double wages, hours;
	HourlyEmployee(String fname, String lname, String ssn, double wages, double hours){
		super(fname, lname, ssn);
		setWages(wages);
		setHours(hours);
	}
	//Setters
	public void setWages(double wages){
		this.wages = wages;
	}
	public void setHours(double hours){
		this.hours = hours;
	}
	//Getters
	public double getWages(){
		return wages;
	}
	public double getHours(){
		return hours;
	}
	public String toString(){
		String SUPER = super.toString();
		String wage = "\nWages: " + getWages() + '\n';
		String hour = "Hours: " + getHours();
		return SUPER + wage + hour;
	}
	double earning(){
		if (hours <= 40)	
			return wages*hours;
		else 
			return (40*wages + ((hours-40)*wages*1.5));
	}
}