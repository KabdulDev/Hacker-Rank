package thirtyDaysOfCode;

/*
 * Author: Karimu Mohammed
 * Description: 
 * Date Created: 2020.03.09
 * Date Modified: 2020.03.09
 * Email: Karimu.Mohammed@gmail.com or Karimu.Mohammed@lc.cuny.edu
 */


import java.util.Scanner;
public class Day1_Data_Types {

	public static void main(String[] args) {

		//Variables
		int num;
		double dec;
		String word;
		Scanner scnr = new Scanner(System.in);
		
		//System Input
		num = scnr.nextInt();
		dec = scnr.nextDouble();
		scnr.nextLine();
		word = scnr.nextLine();
		
		
		//Test assignment for i,d,s
		int i = 19;
		double d = 10.0;
		String s = "Dope";
		
		//Print Stateemnts and Calculation (i,d,s declared separately in hacker rank.
		System.out.println(i + num);
		System.out.println(d + dec);
		System.out.println(s + word);
		
		
		
		
		
	}
	
}

