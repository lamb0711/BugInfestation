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
