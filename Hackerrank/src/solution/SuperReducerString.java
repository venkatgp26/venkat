package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperReducerString {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
    	int i = 0;
    	while( i < s.length()-1 ){
    		StringBuffer sb = new StringBuffer(s);
    		if(s.charAt(i) == s.charAt(i+1)){
    			sb.delete(i,i+2);
    			s= String.valueOf(sb);
    			i = 0;
    		}else{
    		i++;}
    	}
    	//System.out.println(s);
    	if(s.equals("")){
    		return "Empty String";
    	}
		return s;


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}

