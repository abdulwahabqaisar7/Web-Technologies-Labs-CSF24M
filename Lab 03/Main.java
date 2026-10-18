// Write a java program that prompts the user to enter an integer value and display that either the number is the prime or not. User may enter a negative number, so write your own exception class NegativeNumberException , and throw exception when user  enter negative number. Also write your own exception class TooLargeNumberException, throw this exception when user enter integer greater than 50.
// Test your code on following inputs:
// •	Enter Integer:  17			// Answer : Number is prime
// •	Enter Integer:  -3			// Exception: NegativeNumberException
// •	Enter Integer:  65			// Exception: TooLargeNumberException
import java.util.Scanner;
class NegativeNumberException extends Exception{
	int value;
	NegativeNumberException(int value){
		this.value = value;
	}
	public String toString(){
		return "NegativeNumberException";
	}
}
class TooLargeNumberException extends Exception{
	int value;
	TooLargeNumberException(int value){
		this.value = value;
	}
	public String toString(){
		return "TooLargeNumberException";
	}
}
public class Main{
	public static void main(String args[]){
		int number;
		Scanner inp = new Scanner(System.in);
		try{
			System.out.print("Enter Integer: ");
			number = inp.nextInt();
			if (number < 0){
				throw new NegativeNumberException(number);
			}
			if (number > 50){
				throw new TooLargeNumberException(number);
			}
			int flag = 0;
			for(int i = 2; i < number; i++){
				if((number%i) == 0){
					flag = 1;
					break;
				}
			}
			if (flag == 0){
				System.out.println("Answer: Number is Prime");
			}
			else{
				System.out.println("Answer: Number is not Prime");
			}
		}
		catch(NegativeNumberException e){
			System.out.println("Exception: "+ e);
		}
		catch(TooLargeNumberException e){
			System.out.println("Exception: "+ e);
		}
		catch(Exception e){
			System.out.println("Other exception occurs");
		}
		
	}
}