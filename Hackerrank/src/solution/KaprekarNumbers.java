package solution;

import java.util.Scanner;

public class KaprekarNumbers {

    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q) {
    	long square = 0;
    	boolean flag = false;
    	for(long i = p ; i<=q; i++){
    		square = i*i;
    		String str = String.valueOf(square);
    		int wholeLength = str.length();
    		int digitLenghth = String.valueOf(i).length();
    		long rhs =0;
    		long lhs = 0;
    		if(str.length()>1){
    		 rhs = Long.valueOf(str.substring(wholeLength-digitLenghth));
    		 lhs = Long.valueOf(str.substring(0,wholeLength-digitLenghth));}
    		else{
    			rhs = square;
    			lhs = 0;
    		}
    		if(rhs+lhs == i){
    			System.out.print(i +" ");
    			flag = true;
    		}
    		
    		
//    		System.out.println("whole:" + square);
//    		System.out.println("rhs: "+rhs);
//    		System.out.println("LHS: "+lhs);
//    		
    	}
    	if(flag == false){
			System.out.println("INVALID RANGE");
		}
    	

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}
