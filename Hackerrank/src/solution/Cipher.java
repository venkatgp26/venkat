package solution;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cipher {

    // Complete the caesarCipher function below.
	static String caesarCipher(String s, int k) {
		k = k%26;

		String retString = "";
		for (Character ch : s.toCharArray()) {
			if ((Character.isUpperCase(ch)) && !(Character.isLetter((char) ((int) ch + k))&&(Character.isUpperCase((char) ((int) ch + k))))) {
				retString += (char) ('A' +(k- ('Z' - ch)-1));
				System.out.println((char)('A' +(k- ('Z' - ch)-1)));

			} else if ((Character.isLowerCase(ch)) && !(Character.isLetter((char) ((int) ch + k))&&(Character.isLowerCase((char) ((int) ch + k))))) {
			
				retString += (char) ('a' +(k- ('z' - ch)-1));
			} else if (!Character.isAlphabetic(ch)) {
				retString += ch;
			} else {
				retString += (char) ((int) ch + k);
			}

		}
		System.out.println(retString);
		return retString;

	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

