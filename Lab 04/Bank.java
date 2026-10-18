/* Implement a class Bank with attributes the name of account holder, 8-digit account number and amount. Write all the constructors and getter/setters for the data members.

This class must contains the following functionalities:

•	addNewRecord(): to store the information of new account holder in a file (with default balance 1000 dollars).

•	transfer(:) to send the money to any other person having the account in the same bank (i.e., file). Amount changes should be made on both recipient and sender’s account. Your program should throw noAccountAvailbaleException, if the recipient record is not valid.

•	main(): Provide a switch-based menu to execute this program in the following way:
1.	Add New Account
2.	Transfer.
3.	Exit

Instructions:
	You must use ; as separator to recognize the different attributes of an account holder in the file. Therefore, the format of file may looks like:
Marcin		;	12345678	;	1000
Boukhars	;	45454545	; 	500
Kimiaki	;	77777777	;	1500

You must need to handle all the required exceptions.
*/
import java.io.*;
import java.util.*;
class Account{
	String Name;
	String AccountNumber;
	int Amount;
	public Account(String n, String a){
		setName(n);
		setAccountNumber(a);
		setAmount(1000);
	}
	public Account(String n, String a, int am){
		setName(n);
		setAccountNumber(a);
		setAmount(am);
	}
	
	public void setName(String n){
		Name = n;
	}
	public void setAccountNumber(String a){
		AccountNumber = a;
	}
	public void setAmount(int am){
		if(am >= 0){
			Amount = am;
		}
		else{
			Amount = 0;
		}
	}
	public String getName(){
		return Name;
	}
	public String getAccountNumber(){
		return AccountNumber;
	}
	public int getAmount(){
		return Amount;
	}
	
}
class noAccountAvailbaleException extends Exception{
	String number;
	noAccountAvailbaleException(String n){
		number = n;
	}
	public String toString(){
		String o = "Account Number " + number + " is not available!";
		return o;
	}
}
class lowBalanceException extends Exception{
	public String toString(){
		String o = "Balance is less than amount to be transferred";
		return o;
	}
}

public class Bank{
	ArrayList accounts;
	public Bank(){
		accounts = new ArrayList();
		loadData();
	}
	public void addNewRecord(String n, String an){
		Account a = new Account(n, an);
		accounts.add(a);
	}
	public void Transfer(String yr, String an, int transfer_amount){
		try{
			boolean flag1 = false;
			boolean flag2 = false;
			int index1=0, index2=0;
			for(int i = 0; i < accounts.size(); i++)
			{
				Account a = (Account)accounts.get(i);
				if(a.getAccountNumber().equals(yr)){
					flag1 = true;
					index1 = i;
				}
				else if(a.getAccountNumber().equals(an)){
					flag2 = true;
					index2 = i;
				}
			}
			if(!flag1) throw new noAccountAvailbaleException(yr);
			if(!flag2) throw new noAccountAvailbaleException(an);
			Account a1 = (Account)accounts.get(index1);
			Account a2 = (Account)accounts.get(index2);
			if(a1.getAmount() < transfer_amount){
				throw new lowBalanceException();
			}
			a1.setAmount(a1.getAmount() - transfer_amount);
			a2.setAmount(a2.getAmount() + transfer_amount);
		}	
		catch(noAccountAvailbaleException e){
			System.out.println(e);
		}
		catch(lowBalanceException e){
			System.out.println(e);
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
	void loadData(){
		try{
			FileReader fr = new FileReader("Bank.txt");
			BufferedReader br = new BufferedReader(fr);
			String ch = br.readLine();
			while(ch != null){
				String tokens[] = ch.split(";");
				Account a = new Account(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
				accounts.add(a);
				ch = br.readLine();
			}
			br.close();
			fr.close();
		}catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	void saveData(){
		try{
			FileWriter fw = new FileWriter("Bank.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i = 0; i < accounts.size(); i++){
				Account a = (Account) accounts.get(i);
				bw.write(a.getName()+";"+a.getAccountNumber()+";"+a.getAmount());
				bw.newLine();
			}
			bw.close();
			fw.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String args[]){
		int choice;
		Bank b = new Bank();
		while(true){
			System.out.println("Select the choices below to proceed and complete the action of your desired choice");
			System.out.println("1. Add New Account");
			System.out.println("2. Transfer Amount");
			System.out.println("3. Exit");
			Scanner input = new Scanner(System.in);
			System.out.print("Enter Your Choice: ");
			choice = input.nextInt();
			input.nextLine();
			switch(choice){
				case 1:
					System.out.println("Enter Name of the person: ");
					String n = input.nextLine();
					System.out.println("Enter AccountNumber of the person: ");
					String an = input.nextLine();
					b.addNewRecord(n,an);
					break;
				case 2:
					System.out.println("Enter Your Account Number: ");
					String yr = input.nextLine();
					System.out.println("Enter account number in which you want to transfer amount: ");
					String anum = input.nextLine();
					System.out.println("Enter amount to be transferred: ");
					int transfer_amount = input.nextInt();
					b.Transfer(yr, anum, transfer_amount);
					break;
				case 3:
					b.saveData();
					System.exit(0);
			}
		}
		
	}
}