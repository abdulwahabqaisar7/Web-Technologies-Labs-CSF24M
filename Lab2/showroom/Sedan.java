package showroom;
public class Sedan extends Vehicle{
	public Sedan(int id, String model, String brand, String price){
		super(id, model, brand, price);
	}
	public String toString(){
		String s = "Sedan";
		return s + super.toString();
	}
}