public class CommissionEmployee extends Employee{
	private double grossSales, commissionRate;
	CommissionEmployee(String fname, String lname, String ssn, double gs, double cr){
		super(fname, lname, ssn);
		setGrossSales(gs);
		setCommissionRate(cr);
	}
	//Setters
	public void setGrossSales(double gs){
		grossSales = gs;
	}
	public void setCommissionRate(double cr){
		commissionRate = cr;
	}
	//Getters
	public double getGrossSales(){
		return grossSales;
	}
	public double getCommissionRate(){
		return commissionRate;
	}
	public String toString(){
		String SUPER = super.toString();
		String gs = "\nGross Sales: " + getGrossSales() + '\n';
		String cr = "Commission Rate: " + getCommissionRate();
		return SUPER + gs + cr;
	}
	double earning(){
		return commissionRate*grossSales;
	}
}