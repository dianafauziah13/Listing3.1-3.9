import java.util.*;

public class InputTest
{
   public static void main (String[] args){
	Scanner in = new Scanner (System.in);
	
	//get first input
	System.out.print("What is your name?");
	String name = in.nextLine();

	//get second input
	System.out.print("How old are You?");
	int age = in.nextInt();

	//display output in console
	System.out.println ("Hello, " + name + ". Next year, you'll be" + (age + 1));
   }
}