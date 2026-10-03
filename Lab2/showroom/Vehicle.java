package showroom;
public abstract class Vehicle{
	protected int id;
	protected String model, brand, price;
	public Vehicle(int id, String model, String brand, String price){
		setid(id);
		setmodel(model);
		setbrand(brand);
		setprice(price);
	}
	void setid(int id){
		this.id = id;
	}
	void setmodel(String model){
		this.model = model;
	}
	void setbrand(String brand){
		this.brand = brand;
	}
	void setprice(String price){
		this.price = price;
	}
	int getid(){
		return id;
	}
	String getmodel(){
		return model;
	}
	String getbrand(){
		return brand;
	}
	String getprice(){
		return price;
	}
	public String toString(){
		String i = "\nID: " + getid();
		String m = "\nModel: " + getmodel();
		String b = "\nBrand: " + getbrand();
		String p = "\nPrice: " + getprice();
		return (i+m+b+p);
	}
}