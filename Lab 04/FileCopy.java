// Task 01                                                                                                                                                                                               [50]
// Write a Java program named FileCopy that performs the following operations:
// 1.	Ask the user to enter the path or name of an existing source file.
// 2.	Ask the user to enter the path or name of the destination file.
// 3.	Check whether the source file exists.
// 4.	Read the contents of the source file (line-by-line) and copy the complete contents of the source file into the destination file.
// 5.	Display a success message after the copying operation is completed.
// 6.	Handle errors appropriately, such as a missing source file, an inaccessible file, or an invalid destination path.
import java.io.*;
import java.util.Scanner;
public class FileCopy{
	public static void main(String args[])throws IOException{
		String source, destination;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Path or name of existing source file: ");
		source = input.nextLine();
		System.out.print("Enter the Path or name of existing destination file: ");
		destination = input.nextLine();
		try{
			FileReader src = new FileReader(source);
			FileWriter dest = new FileWriter(destination);
			BufferedReader srcb = new BufferedReader(src);
			PrintWriter destb = new PrintWriter(dest);
			String ch = srcb.readLine();
			while(ch != null){
				destb.println(ch);
				ch = srcb.readLine();
			}
			System.out.println("File Copied Successfully");
			destb.flush();
			srcb.close();
			destb.close();
			src.close();
			dest.close();
		}
		catch(FileNotFoundException e){
			System.out.println("File Not Found" + e);
		}
		catch(IOException e){
			System.out.println("Input Output Exception" + e);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}