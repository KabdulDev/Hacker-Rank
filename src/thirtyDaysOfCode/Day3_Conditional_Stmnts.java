
	/*
	 * Author: Karimu Mohammed
	 * Description: Day 3 of Conditional Statements
	 * Date Created: 2020.03.11
	 * Date Modified: 2020.03.11
	 * Email: Karimu.Mohammed@gmail.com or Karimu.Mohammed@lc.cuny.edu
	 */

/*
 * Hacker Rank Problem:
 * Objective
In this challenge, we're getting started with conditional statements. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given an integer ,n, perform the following conditional actions:

    If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird

Complete the stub code provided in your editor to print whether or not n is weird.

Input Format

A single line containing a positive integer, n.

Constraints
n >= 1 && n <= 100
Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Explanation

Sample Case 0: n=3

n is odd and odd numbers are weird, so we print Weird.

Sample Case 1: n=24

n > 20 and n is even, so it isn't weird. Thus, we print Not Weird.
 */


package thirtyDaysOfCode;

import java.util.Scanner;

public class Day3_Conditional_Stmnts {
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if (n % 2 == 1) {
			System.out.println("Weird");
		}
		
		else if (n>=2 && n<=5 && n%2==0 ) {
			System.out.println("Not Weird");
		}
		
		else if (n>=6 && n <= 20 && n%2 == 0) {
			System.out.println("Weird");
		}
		else if (n > 20 && n%2 == 0) {
			System.out.println("Not Weird");
		}
		
		scan.close();
	}

}
