package codingworld;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BinaryNumbers {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int remainder=0,pointer=0,count=0;


    while(n>0)
        {
        remainder=n%2;
        n=n/2;
        if(remainder==1)
         {   pointer++;
           if(pointer>=count)
            count=pointer;
        }
        else{

            pointer=0;
        }   
    }

    System.out.println(count);
        scanner.close();
    }
}
