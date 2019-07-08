package solution;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StrongPassword {

    // Complete the minimumNumber function below.
	static int minimumNumber(int n, String password) {
		String numbers = "0123456789";
		String lower_case = "abcdefghijklmnopqrstuvwxyz";
		String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String special_characters = "!@#$%^&*()-+";
		int count = 0;
		boolean nb = false;
		boolean lc = false;
		boolean uc = false;
		boolean sc = false;
		int l = 6;
		
		for (char ch : password.toCharArray()) {
			if (numbers.contains(String.valueOf(ch))) {
				nb = true;
				l = l-1;
			} else if (lower_case.contains(String.valueOf(ch))) {
				lc = true;
				l = l-1;
			} else if (upper_case.contains(String.valueOf(ch))) {
				uc = true;
				l = l-1;
			} else if (special_characters.contains(String.valueOf(ch))) {
				sc = true;
				l = l-1;
			} else {
				count++;
			}
		}
		List<Boolean> countList = new ArrayList<Boolean>();
		countList.add(nb);
		countList.add(lc);
		countList.add(uc);
		countList.add(sc);
		//System.out.println(count);
		
		
			return Math.max(l,Collections.frequency(countList, false));
		
		

	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

//        bufferedWriter.write(String.valueOf(answer));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

