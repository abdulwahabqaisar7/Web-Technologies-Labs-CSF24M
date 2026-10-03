package runner;
import showroom.*;
import java.util.Scanner;
public class Driver{
	public static void main(String args[]){
		int choice;
		Scanner input = new Scanner(System.in);
		Vehicle[] v = new Vehicle[10];
		v[0] = new Sedan(1,"Toyota Corolla(2016)", "Toyota", "PKR. 30,00,000");
		v[1] = new Sedan(2,"Honda City(2017)", "Honda", "PKR. 28,50,000");
		v[2] = new SUV(3,"Suzuki Mehran(2015)", "Suzuki", "PKR. 7,00,000");
		v[3] = new Sedan(4,"Toyota Corolla(2010) ", "Toyota", "PKR. 20,25,000");
		v[4] = new SUV(5,"Suzuki Alto(2022)", "Suzuki", "PKR. 25,00,000");
		v[5] = new Sedan(6,"Changan Caravan(2024) ", "Changan", "PKR. 35,30,000");
		v[6] = new SUV(7,"Suzuki Wagonr(2018)", "Suzuki", "PKR. 16,00,000");
		v[7] = new Sedan(8,"Toyota Yaris(2020) ", "Toyota", "PKR. 39,16,000");
		v[8] = new SUV(9,"Suzuki Cultus(2015)", "Suzuki", "PKR. 18,00,000");
		v[9] = new Sedan(10,"Toyota Corolla(2024) ", "Toyota", "PKR. 43,25,000");
		
		showMenu();
		System.out.print("Enter the number: ");
		choice = input.nextInt();
		for(int i = 0; i < 10; i++){
			if(choice == 1 && v[i] instanceof Sedan){
				System.out.println(v[i]);
			}
			else if(choice == 2 && v[i] instanceof SUV){
				System.out.println(v[i]);
			}
		}
	}
	private static void showMenu(){
		System.out.println("===Welcome to XYZ Car Showroom===");
		System.out.println("Press the following options given below to select type of car");
		System.out.println("1: Sedan");
		System.out.println("2: SUV");
	}
}