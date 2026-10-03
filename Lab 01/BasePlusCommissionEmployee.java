public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;
	BasePlusCommissionEmployee(String fname, String lname, String ssn, double gs, double cr, double bs){
		super(fname, lname, ssn, gs, cr);
		setBaseSalary(bs);
	}
	//Setter
	public void setBaseSalary(double bs){
		baseSalary = bs;
	}
	//Getter
	public double getBaseSalary(){
		return baseSalary;
	}
	public String toString(){
		String SUPER = super.toString();
		String bs = "\nBase Salary: " + getBaseSalary();
		return SUPER + bs;
	}
	double earning(){
		return (super.getGrossSales() * super.getCommissionRate())+baseSalary;
	}
}