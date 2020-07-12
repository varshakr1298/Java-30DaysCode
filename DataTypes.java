package codingworld;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypes {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int i1=0;
        double d1=0.0;
        String s1="";
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        i1=scan.nextInt();
        d1=scan.nextDouble();
        s1=scan.next();
        s1+=scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+i1);
        /* Print the sum of the double variables on a new line. */
		double result=d+d1;
        DecimalFormat numberFormat = new DecimalFormat("#.0");
        System.out.println(numberFormat.format(result));
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        String rs=s.concat(s1);
        System.out.print(rs);
        scan.close();
        }
    }