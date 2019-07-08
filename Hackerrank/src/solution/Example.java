package solution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
//    	Map<Integer,Integer> mp = new HashMap<>();
//    	for(Integer a : arr){
//    		if(mp.keySet().contains(a)){
//    			mp.put(a, mp.get(a)+1);
//    		}else{
//    			mp.put(a, 1);
//    		}
//    	}
//    	int max = arr.get(0);
//    	int count = 0;
//    	for(Integer k : mp.keySet()){
//    		if(mp.get(k)>count){
//    			
//    		}
//    	}
    	int[] r = new int[5];
    	for (Integer i : arr) {
			r[i-1]++;
		}
    	
    	int maxcount = 0;
    	int index = 0;
    	for(int i = 0; i<r.length; i++){
    		if(r[i]>maxcount){
    			maxcount = r[i];
    			index = i;
    		}
    	}
    	System.out.println(index+1);
    	
		return index+1;


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr.add(arrItem);
        }

        int result = migratoryBirds(arr);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
