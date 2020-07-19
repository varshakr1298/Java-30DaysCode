package codingworld;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LetsReview {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++){
            char[] S = scan.next().toCharArray();
            StringBuilder oddpart = new StringBuilder();
            StringBuilder evenpart = new StringBuilder();
   
            for(int j = 0; j < S.length; j++) {
                if( (j & 1) == 0) {
                    evenpart.append(S[j]);
                }
                else {
                    oddpart.append(S[j]);
                }
            }
            
            System.out.println(evenpart + " " + oddpart);
        }
        scan.close();
    }
}

