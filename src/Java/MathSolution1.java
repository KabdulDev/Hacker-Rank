	/*
	 * Author: Karimu Mohammed
	 * Description: 
	 * Date Created: 2020.03.08
	 * Date Modified: 2020.03.08
	 * Email: Karimu.Mohammed@gmail.com or Karimu.Mohammed@lc.cuny.edu
	 */


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MathSolution1 {

    /*
     * Complete the findPoint function below.
     */
    static int[] findPoint(int px, int py, int qx, int qy) {
        /*
         * Write your code here.
         */
    	int rx = (qx - px) + qx ; //calculating rx
    	int ry = (qy - py) + qy; //calculating ry
    	int [] rPoints = {rx, ry}; //creating an array rPoints with rx, ry
    	return rPoints; //return the array

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH"))); //establishes a Buffered Writer ?

        int n = Integer.parseInt(scanner.nextLine().trim()); //Allows for the first entered line to be the number of point pair px,py and qx, qy to be entered

        for (int nItr = 0; nItr < n; nItr++) { //establishes the for loop to continue n number of times with nItr being a stand in for n and being set between 0 and n
            String[] pxPyQxQy = scanner.nextLine().split(" "); //turns the String of numbers into an array with the split occuring based on spaces between the #'s

            int px = Integer.parseInt(pxPyQxQy[0].trim()); //First # in the array and point px

            int py = Integer.parseInt(pxPyQxQy[1].trim()); // second # in the array and point py

            int qx = Integer.parseInt(pxPyQxQy[2].trim()); //third # in the array and point qx

            int qy = Integer.parseInt(pxPyQxQy[3].trim()); //fourth # in the array and point qy

            int[] result = findPoint(px, py, qx, qy); //Returns earlier find point function

            for (int resultItr = 0; resultItr < result.length; resultItr++) {
                bufferedWriter.write(String.valueOf(result[resultItr]));

                if (resultItr != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
