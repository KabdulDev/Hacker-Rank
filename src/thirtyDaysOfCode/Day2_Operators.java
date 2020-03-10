
	/*
	 * Author: Karimu Mohammed
	 * Description: Day 2 of Hacker Rank's 30 days of Code
	 * Date Created: 2020.03.10
	 * Date Modified: 2020.03.10
	 * Email: Karimu.Mohammed@gmail.com or Karimu.Mohammed@lc.cuny.edu
	 */

	/* Hacker Rannk Description
	 * Objective
	In this challenge, you'll work with arithmetic operators. Check out the Tutorial tab for learning materials and an instructional video!
	
	Task
	Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.
	
	Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result!
	
	Input Format
	
	There are 3	lines of numeric input:
	The first line has a double, mealCost (the cost of the meal before tax and tip).
	The second line has an integer, tipPercent (the percentage of being added as tip).
	The third line has an integer, taxPercent (the percentage of
	
	being added as tax).
	
	Output Format
	
	Print the total meal cost, where totalCost is the rounded integer result of the entire bill ( mealCost with added tax and tip).
	 */

package thirtyDaysOfCode;

import java.util.Scanner;
import java.math.*;
public class Day2_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize necessary variables
		double mealCost = 0.0;
		int tipPercent, taxPercent = 0;
		
		//Value Inputs
		Scanner scan = new Scanner(System.in); //create scanner for value input
		
		mealCost = scan.nextDouble(); //get value for Double of meal
		tipPercent = scan.nextInt(); //get tip percent as int
		taxPercent = scan.nextInt(); //get tax percent as int
		scan.close(); //close the scanner when you're done
		
		//Calculate the necessary values for the total cost
		double tip = (mealCost * (tipPercent/100.0));
		double tax = (mealCost * (taxPercent/100.0));
		
		double totalCost = mealCost + tip + tax;
		
		//double totalCost = mealCost + (mealCost * (tipPercent/100)) + (mealCost * (taxPercent/100));
		
		System.out.println(Math.round(totalCost)); //Print the Value of Total Cost rounded to the nearest integer using the Math Library
				

	}

}
