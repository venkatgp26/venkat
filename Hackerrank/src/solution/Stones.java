package solution;

import java.io.IOException;
import java.util.Scanner;

public class Stones {

	// Complete the stones function below.
	static int[] stones(int n, int a, int b) {
		int[] arr = new int[n];
		int s = Math.min(a, b);
		int l = Math.max(a, b);
		if (s == l) {
			int[] arr2 = new int[1];
			arr2[0] = s * n - 1;
			System.out.println(s * (n - 1));
			return arr2;
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(((n - i - 1) * s) + (i * l) + " ");

			arr[i] = ((n - i - 1) * s) + (i * l);
		}
		System.out.println();
		return arr;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int T = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int TItr = 0; TItr < T; TItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int a = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int b = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] result = stones(n, a, b);

			// for (int i = 0; i < result.length; i++) {
			// bufferedWriter.write(String.valueOf(result[i]));
			//
			// if (i != result.length - 1) {
			// bufferedWriter.write(" ");
			// }
			// }
			//
			// bufferedWriter.newLine();
			// }
			//
			// bufferedWriter.close();

			// scanner.close();
		}
	}
}