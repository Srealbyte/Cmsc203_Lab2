/**
   This program demonstrates how numeric types and operators behave in Java
*/
import java.util.*;
public class NumericTypes {
	public static void main (String [] args) {
		//TASK #2 Create a Scanner object here 
		//identifier declarations
		Scanner userInput= new Scanner(System.in);
		final int NUMBER = 2; // number of scores
		double score1 = 100.0; // first test score
		double score2 = 95.0; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		//Task #2 declare a variable to hold the user’s temperature
		double temp;
		//Task #2 prompt user to input score1
		System.out.println("Enter a value for score1:");
		//Task #2 read score1 
		score1= userInput.nextDouble();
		//Task #2 prompt user to input score2
		System.out.println("Enter a value for score2:");
		//Task #2 read score2
		score2 = userInput.nextDouble();
		// Find an arithmetic average
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = (5.0/9.0) * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		//Task #2 prompt user to input another temperature
		System.out.println("Enter another temperature:");
		//Task #2 read the user’s temperature in Fahrenheit
		temp = userInput.nextDouble();
		//Task #2 convert the user’s temperature to Celsius
		temp= (5.0/9.0) * (BOILING_IN_F - 32);
		//Task #2 print the user’s temperature in Celsius
		System.out.println("The temperature in Celsius is "+temp);
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}