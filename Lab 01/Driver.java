public class Driver{
	public static void main(String args[]){
		Employee[] myemployees = new Employee[10];
		myemployees[0] = new Employee("Ali", "Ahmad", "S110");
		myemployees[1] = new Employee("Abdullah", "Fayyaz", "S111");
		myemployees[2] = new SalariedEmployee("Ahmad", "Riaz", "S210",15000);
		myemployees[3] = new SalariedEmployee("Mubashar", "Raza", "S211",19000);
		myemployees[4] = new HourlyEmployee("Aziz", "Khan", "S310",1000,38);
		myemployees[5] = new HourlyEmployee("Uzair", "Ali", "S311",950,42);
		myemployees[6] = new CommissionEmployee("Rana", "Akbar", "S410",120,4);
		myemployees[7] = new CommissionEmployee("Riaz", "Hameed", "S411",95,3.5);
		myemployees[8] = new BasePlusCommissionEmployee("Rehan", "Mansoor", "S510",85,3.0, 30000);
		myemployees[9] = new BasePlusCommissionEmployee("Faizan", "Hayat", "S511",130,4.5, 45000);
		for (int i = 0; i < 10; i++){
			if (myemployees[i] instanceof BasePlusCommissionEmployee)
			{
				BasePlusCommissionEmployee temp = (BasePlusCommissionEmployee)myemployees[i];
				double bs = temp.getBaseSalary();
				temp.setBaseSalary(bs*1.1);
			}
			System.out.println("\nEmployee "+(i+1));
			System.out.println(myemployees[i]);
			System.out.println("Total Earnings: " + myemployees[i].earning());
		}
	}
}