package solution;

import java.io.IOException;
import java.util.Scanner;

public class MinimumDistances {

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
    	int min = 1000000;
    	for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] == a[j] && j-i < min){
					min = j-i;
				}
				
			}
			
		}
    	System.out.println(min);
    	if(min == 1000000){
    		return -1;
    	}
		return min;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minimumDistances(a);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

