import java.util.Scanner;

public class CIS2323_Week02_Homework1 {
	
	public static void main (String [] args) {
		
		String name, noun1, nounPlant, nounFruit, nounAlco, nounBeverage, verb1Action, verb2Action, verbSense, adj, adverb, nounAction, nounPlace;
		double oz1, oz2;
		int soda, people;

		// float should have F in the end of the number (Long should have L)
		//float myHeight = 5.7F;
		//double 	myHeight = 5.7;
				
		//scanner here - is a class/object and inputDevice - a variable (object)
		// Here we declare a variable and initialize it - new - allocates memory for the variable
		Scanner inputDevice=new Scanner(System.in); // System is object, and shows which type of device - in or out
		
		System.out.println("What is your name?");
		name= inputDevice.nextLine();
		
		System.out.println("Make up a funny noun:");
		noun1= inputDevice.nextLine();
		
		System.out.println("Enter a plant (noun):");
		nounPlant= inputDevice.nextLine();
		
		System.out.println("Enter a fruit (noun):");
		nounFruit= inputDevice.nextLine();
		
		System.out.println("Enter Alcohol beverage name:");
		nounAlco= inputDevice.nextLine();
		
		System.out.println("Enter NON-Alcohol beverage name:");
		nounBeverage= inputDevice.nextLine();
		
		System.out.println("Enter an ACTION VERB:");
		verb1Action= inputDevice.nextLine();
		
		System.out.println("Enter another ACTION VERB:");
		verb2Action= inputDevice.nextLine();
		
		System.out.println("Enter an SENSE VERB:");
		verbSense= inputDevice.nextLine();
		
		System.out.println("Enter an adjective:");
		adj= inputDevice.nextLine();
		
		System.out.println("Enter an adverb:");
		adverb= inputDevice.nextLine();
		
		System.out.println("Enter ACTION (noun or gerund):");
		nounAction= inputDevice.nextLine();
		
		System.out.println("Enter a place/location :");
		nounPlace= inputDevice.nextLine();
				
		System.out.println("Enter a decimal in the format (ex 5.5):");
		oz1= inputDevice.nextDouble();
		
		System.out.println("Enter one more decimal in the format (ex 5.5):");
		oz2= inputDevice.nextDouble();
		
		System.out.println("Enter a whole number:");
		soda= inputDevice.nextInt();
		
		System.out.println("Enter another number:");
		people= inputDevice.nextInt();
		
		System.out.println("Hello, "+ name+ ", \n"+
		"Today We are going to make Your Signature Drink!\n"+
		"\t\t\t"+name+"\'s " + noun1 +
		"____________________________"
		);
		
		
		
		
		
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