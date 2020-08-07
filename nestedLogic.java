package codingworld;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class nestedLogic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner s = new Scanner(System.in);
    int actual_day = s.nextInt();
    int actual_month = s.nextInt();
    int actual_year = s.nextInt();

    int exp_day = s.nextInt();
    int exp_month = s.nextInt();
    int exp_year = s.nextInt();
    
    int fine=0;

    if(actual_year < exp_year){   
        fine=0;
    }else{
        if(actual_year > exp_year){   
            fine=10000;
        }else if(actual_month > exp_month){    
            fine=500 * (actual_month - exp_month);
        }else if(actual_day > exp_day){     
            fine=15 * (actual_day - exp_day);
        }
    }              
    System.out.println(fine);  
    }
}

