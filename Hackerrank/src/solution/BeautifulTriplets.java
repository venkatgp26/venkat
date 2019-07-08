package solution;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BeautifulTriplets {

    // Complete the beautifulTriplets function below.
    static int beautifulTriplets(int d, int[] arr) {
    	int finCount = 0;
    	
    	for(int i=0;i<arr.length-2;i++){
    		if(Arrays.binarySearch(arr, arr[i]+d)>-1 && Arrays.binarySearch(arr,arr[i]+d+d)>-1){
    			++finCount;
    		}
//    		int temp = arr[i];
//    		int countTri = 0;
//    		for(int j = i+1; j<arr.length; j++){
//    			if(arr[j] - temp == d){
//    				temp = arr[j];
//    				++countTri;
//    			}
//    			if(countTri==2){
//    				++finCount;
//    				break;
//    			}
//    		}
    	}
    	System.out.println(finCount);
		return finCount;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = beautifulTriplets(d, arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

