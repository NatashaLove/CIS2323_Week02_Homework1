import java.util.Scanner;

public class CIS2323_Week02_Homework1 {
	
	public static void main (String [] args) {
		
		String name, noun1, nounPlant, nounFruit, nounAlco, nounBeverage, verb1Action, verb2Action, verbSense, adj, adverb, nounAction, nounPlace;
		float oz1, oz2;
		int soda, people;

		// float should have F in the end of the number (Long should have L)
		//float myHeight = 5.7F;
		//double 	myHeight = 5.7;
				
		//scanner here - is a class/object and inputDevice - a variable (object)
		// Here we declare a variable and initialize it - new - allocates memory for the variable
		Scanner inputDevice=new Scanner(System.in); // System is object, and shows which type of device - in or out
		
		System.out.println("What is your name?");
		name= inputDevice.nextLine();
		System.out.println("Hello, "+ name+ ", \n"+
		"Today We are going to make Your Signature Drink!"
		);
		// name+"\'s" + noun1  -- name ofthe drink;
		
		/*
		System.out.println("Hello CIS2323 \n" +
		"I am " + myAge + " years old.\n" +
		"I am a " + mySex
		);
		
		System.out.println("What is your name?");
		name= inputDevice.nextLine();
		System.out.println("Hello, " + name + ", welcome to the class!");
		*/
	}
}