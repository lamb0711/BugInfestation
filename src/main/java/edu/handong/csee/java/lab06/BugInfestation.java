package edu.handong.csee.java.lab06;
import java.util.Scanner;
/**
 * This class count number of weeks until the room is full with roachs.
 * The growth rate and volume of roach increase each week. 
 * Growth rate increase 0.95 and volume increase 0.002.
 * HowMuchBug method add growth and volume. And print the result.
 * @author magic
 *
 */
public class BugInfestation {
	
	static final double GROWTH_RATE = 0.95;//unchanged variable GROWTH_RATE
	static final double ONE_BUG_VOLUME = 0.002;//unchanged variable ONE_BUG_VOLUME
	
	public void HowMuchBug(double pop, double house) {
		int countWeeks=0;//count week variable
		double totalBugVolume=pop;//total bug volume variable
		double newBugs;//increase bug population variable
		double newBugVolume=0;//increase bug population variable
		
		while(totalBugVolume < house) {//when room is full with bug, stop loop
			newBugs = pop * GROWTH_RATE;//save increase population
			newBugVolume = newBugs * ONE_BUG_VOLUME;//save increase volume
			pop = pop + newBugs;//save total bug population
			totalBugVolume = totalBugVolume + newBugVolume;//save total bug volume
			countWeeks++;//increase week each one loop
		}
		
		System.out.println("after "+countWeeks+" weeks");//print count week 
		System.out.println("the house will be filled with "+(int)pop+" roaches.");//print bug population
		System.out.println("They will fill a volume of "+(int)totalBugVolume+" cubic feet.");//print total bug volume
		System.out.println("Better call Debugging Experts Inc.");//ask call CESCO..

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double houseVolume;//save house volume
		double startPopulation;//save first bug population
		double population;//save population
		
		
		Scanner keyboard = new Scanner(System.in);//use scanner class with keyboard
		
		BugInfestation how = new BugInfestation();//call instance variable how
		
		System.out.println("Enter the total volume of your house");//print message for house volume
		System.out.print("in cubic feet: ");//print volume unit
		houseVolume = keyboard.nextInt();//save input value to houseVolume
		System.out.println("Enter the estimated number of");//print message for bug number
		System.out.print("roaches in your house: ");//print bug unit
		startPopulation = keyboard.nextInt();//save input value to startPopulation
		population = startPopulation;//save start population to population
		
		System.out.println("Starting with a roach population of "+(int)startPopulation);//print start population
		System.out.println("and a house with a volume of "+(int)houseVolume+" cubic feet.");//print house volume
		
		how.HowMuchBug(population, houseVolume);//call method to calculate volume and weeks. And print it

	}

}
