package solution;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MinimumSwaps {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
    	Map<Integer, Integer> mp = new TreeMap<>();
    	int count = 0;
    	for(int i = 0 ; i<arr.length ; i++){
    		mp.put(arr[i], i);
    	}
    	System.out.println(mp);
    	int check = 0;
    	for(Integer in : mp.values()){
    		if(in == check){
    			System.out.println(in);
    			++count;
    		}
    		++check;
    	}
    	System.out.println(count);
		return count - 1;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

       // bufferedWriter.write(String.valueOf(res));
       // bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}

