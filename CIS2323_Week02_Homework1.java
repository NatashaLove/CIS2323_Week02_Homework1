import java.util.Scanner;

public class CIS2323_Week02_Homework1 {
	
	public static void main (String [] args) {
		
		String name, noun1, nounPlant, nounFruit, nounAlco, nounBeverage, verb1Action, verb2Action, verbSense, adj, adverb, nounAction, nounPlace;
		double oz1, oz2;
		int soda, people;

		//scanner here - is a class/object and inputDevice - a variable (object)
		// Here we declare a variable and initialize it - new - allocates memory for the variable
		Scanner inputDevice=new Scanner(System.in); // System is object, and shows which type of device - in or out
		
		System.out.println("\n\tHello! What is your name?");
		name= inputDevice.nextLine();
		
		System.out.println(name+"! Make up a funny noun:");
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
		
		System.out.println("*******************************************\n"+
		"Hello, "+ name+ ", \n"+
		"Today We are going to make Your Signature Drink!\n"+
		"\t\t\t____________________________\n"+
		"\t\t\t"+"*"+name+"\'s " + noun1 +"*\n"+
		"\t\t\t____________________________\n"+
		
		"\t\t\t How to make a "+ noun1+":\n"+
		"What is in a " +noun1+":\n"+
		"*	Fresh "+nounPlant+" leaves -"+oz1+" oz;\n"+
		"*	Fresh "+nounFruit+";\n"+
		"*	"+nounAlco+" - "+oz2+";\n"+
		"*	Sugar or simple syrup\n"+
		"*	"+nounBeverage+" - "+soda+" oz\n"+"\n"+
		"************************************************\n"+"\n"+

		"We are making a "+noun1+" pitcher recipe.\n"+
		"This should be enough to serve "+ people+" people.\n"+
		"You will start by adding plenty of fresh "+nounPlant+" leaves to a pitcher along with some sugar and "+nounFruit+" wedges.\n"+
		verb1Action+" them together.\n"+
		verb1Action+"ing - just means "+verb2Action+" the leaves of the "+nounPlant+" with the sugar and "+nounFruit+".\n"+
		"Do this just until you "+verbSense+" the "+nounPlant+".\n"+
		"Do NOT over "+verb1Action+" your "+nounPlant+" or things will start to taste "+adj+".\n"+
		"Next, you will just pour the "+nounBeverage+" and "+ nounAlco+" over the top and give it a "+adverb+" "+nounAction+".\n"+
		"Serve these "+noun1+"s over plenty of ice and garnish with a branch of "+nounPlant+ ", if desired.\n"+
		"Enjoy these "+noun1+"s out by the "+nounPlace+" or at a party!\n");
		
		
	}
}