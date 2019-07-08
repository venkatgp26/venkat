package solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeperateNumbers {

    // Complete the separateNumbers function below
    static void separateNumbers(String s) {
    	int i = 0;
    	int num = Integer.valueOf(s.charAt(0));
    	String q = ""+num;
    	while(i<=s.length()){
    		q=q+(num+1);
    	}
    	
    	
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            separateNumbers(s);
        }

        scanner.close();
    }
}

