package codingworld;

import java.util.Scanner;

public class ConditionalStatements {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(N%2==1){
            ans = "Weird";
        }
        // 'n' must be even; proceed if 'n' >= 2
        else if(N >= 2){ 
            if(N > 20){ 
                ans = "Not Weird";
            }
            else if(N >= 6){ 
                ans = "Weird";
            }
            else if(N >= 2){
                ans = "Not Weird";
            }
        }
        System.out.println(ans);

    }

}
