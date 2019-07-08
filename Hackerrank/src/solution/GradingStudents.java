package solution;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result1 {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> li = new ArrayList<Integer>();
		for (Integer i : grades) {
			System.out.println(i);
			if (i % 5 == 0 || i < 38) {
				System.out.println(i);
				li.add(i);
			}else if ((i + 1) % 5 == 0) {
				System.out.println(i+1);
				li.add(i + 1);
			}else if ((i + 2) % 5 == 0) {
				System.out.println(i+2);
				li.add(i + 2);
			} else{
				li.add(i);
			}
		}
		System.out.println(li);
		return li;
	}

}

public class GradingStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            grades.add(gradesItem);
        }

        List<Integer> result = Result1.gradingStudents(grades);

        for (int i = 0; i < result.size(); i++) {
            //bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                //bufferedWriter.write("\n");
            }
        }

        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}

