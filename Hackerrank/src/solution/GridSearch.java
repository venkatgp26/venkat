package solution;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class GridSearch {

	// Complete the gridSearch function below.
	static String gridSearch(String[] G, String[] P) {
		Set<Integer> se = new HashSet<Integer>();
		List<Integer> li = new ArrayList<>();
		int i = 0;
		int j = 0;
		int count =0;
		int count2 = 0;
		while (i < G.length) {
			if (j < P.length && G[i].contains(P[j])) {
				 //System.out.println(G[i].indexOf(P[j]));
				 li.add(i);
				 count++;
				se.add(G[i].indexOf(P[j]));
				j++;
			}
			i++;
		}
		// System.out.println(se.size());
		//System.err.println(count == P.length);
		
		if (se.size() == 1 && count == P.length) {
			System.out.println("YES");
			return "YES";
		} else if(count == P.length && se.size()!=1){
			Integer max = Collections.max(se);
			System.out.println(max);
			for(int k = 0; k<li.size(); k++){
				System.out.println(G[li.get(k)].substring(max, max+P[k].length()));
			System.out.println(P[k]);
				if(G[li.get(k)].substring(max, max+P[k].length()).equals(P[k])){
					count2++;
				}
			}
			if(count2 == P.length){
				System.out.println("YES");
				return "YES";
			}
		}
		System.out.println("NO");
		return "NO";

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			String[] RC = scanner.nextLine().split(" ");

			int R = Integer.parseInt(RC[0]);

			int C = Integer.parseInt(RC[1]);

			String[] G = new String[R];

			for (int i = 0; i < R; i++) {
				String GItem = scanner.nextLine();
				G[i] = GItem;
			}

			String[] rc = scanner.nextLine().split(" ");

			int r = Integer.parseInt(rc[0]);

			int c = Integer.parseInt(rc[1]);

			String[] P = new String[r];

			for (int i = 0; i < r; i++) {
				String PItem = scanner.nextLine();
				P[i] = PItem;
			}

			String result = gridSearch(G, P);

			// bufferedWriter.write(result);
			// bufferedWriter.newLine();
		}

		// bufferedWriter.close();

		scanner.close();
	}
}
