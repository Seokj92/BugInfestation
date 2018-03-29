package edu.handong.csee.java.lab06; // package name
import java.util.Scanner; // importing a package, java.util.Scanner

/**
 * This is a class to find number of weeks to exceed the capacity of the house, number and volume of roaches
 * The BugInfestation class has double variables
 * The BugInfestation class has computeNumberOfBugsToUseFkiller() and main methods.
 * 
 * @author JS
 *
 */

public class BugInfestation // define a class
{
	
	final double GROWTH_RATE = 0.95; // declare a double variable. This is constants.(The value never changes)
	final double ONE_BUG_VOLUME = 0.002; // declare a double variable. This is constants.(The value never changes)
	
/**
 * The main method of this program which print out the value to be obtained.
 * @author JS
 * @param args unused
 */
	public static void main(String[] args) // this is a main method
	{
		
		BugInfestation myCesco = new BugInfestation(); //instantiate BugInfestation class
		myCesco.computeNumberOfBugsToUseFkiller(); // call computeNumberOfBugsToUseFkiller of the instance that myCesco refers.
		
	}
/**
 * This is a method to get the value to be obtained.
 * This method has int, double variables.
 * @author JS
 * 
 */
	public void computeNumberOfBugsToUseFkiller()//we don't need parameter 
	{
		Scanner sc = new Scanner(System.in); //make the Scanner instance to get the number from keyboard.
		
		System.out.print("Enter the total volume of your house \nin cubic feet : "); //print out the string
		double houseVolume = sc.nextDouble(); //get the houseVolume from keyboard
		System.out.print("Enter the estimated number of\nroaches in your house : "); //print out the string
		double startPopulation  = sc.nextDouble();// get the initial population of roaches from keyboard
		double population = startPopulation; //setting a initial population
		double totalBugVolume = population * ONE_BUG_VOLUME; //this is a total volume of bugs
				
		int countWeeks = 0; //setting a initial week to count
		while (totalBugVolume < houseVolume) //totalbugvolume can't be larger than housevolume.
		{
			double newBugs = population * GROWTH_RATE; //the number of newly created bugs
			double newBugVolumn = newBugs * ONE_BUG_VOLUME;//the volume of newly created bugs
			population = population + newBugs;//initial population + newly created population
			totalBugVolume = population * ONE_BUG_VOLUME; //this is a total volume of bugs
			countWeeks = countWeeks + 1; //On a weekly basis, bugs increase
		}
		
		System.out.println("Starting with a roach population of " + (int)startPopulation); //print out the initial population. It is printed in the int type.
		System.out.println("and a house with a volume of " + houseVolume +" cubic feet"); //print out the housevolume
		System.out.println("after " + countWeeks + " weeks"); //print out the length of weeks bugs multiplied.
		System.out.println("the house will be filled with " + (int)population + " roaches"); //print out the total number of bugs in int type.
		System.out.println("They will fill a volume of " + (int)totalBugVolume + " cubic feet");//print out the total bug volume in int type.
		System.out.println("Better call Debugging Experts Inc");//print out the string
	}
	
	
}