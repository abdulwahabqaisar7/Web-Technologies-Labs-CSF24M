package showroom;
public class SUV extends Vehicle{
	public SUV(int id, String model, String brand, String price){
		super(id, model, brand, price);
	}
	public String toString(){
		String s = "SUV";
		return s + super.toString();
	}
}