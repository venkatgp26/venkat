package solution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    	int maxCount = 0;
    	Collections.sort(a);
    	for(int i = 0; i<a.size()-1; i++){
    		int  count = 1;
    		for(int j = i+1; j<a.size();j++){
    			if(Math.abs(a.get(i)-a.get(j))<=1){
    				count++;
    			}
    			
    		}
    		if(count > maxCount){
    			maxCount = count;
    		}
    	}
    	System.out.println(maxCount);
		return maxCount;

    }

}

public class PickingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println();
        System.out.println(n);

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        System.out.println(Arrays.toString(aTemp));

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result.pickingNumbers(a);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
