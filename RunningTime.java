package codingworld;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RunningTime {
    static boolean isPrime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            String str;
            if (x >= 2 && isPrime(x)) {
                str = "Prime";
            } else {
                str = "Not prime";
            } 
            System.out.println(str);
        }
    }
}





