package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestString {

	// Complete the alternate function below.
	static int alternate(String s) {
		int max = 0;
		Set<String> se = new HashSet<String>();
		for (Character ch : s.toCharArray()) {
			se.add(String.valueOf(ch));
		}
		// System.out.println(se);
		List<String> li = new ArrayList<String>();
		li.addAll(se);

		for (int i = 0; i < li.size() - 1; i++) {
			for (int j = i + 1; j < li.size(); j++) {
				// System.out.println(li.get(i)+" "+li.get(j));
				String replaceAll = s.replaceAll("[^." + li.get(i) + "." + li.get(j) + ".]", "");
				// String second = replaceAll.replaceAll(li.get(j), "");
				int c = checkLength(replaceAll, li.get(i), li.get(j));
				if (c > max) {
					max = c;
				}
			}
		}
//		System.out.println(max);
		return max;

	}

	private static int checkLength(String replaceAll, String string, String string2) {

		String s = "";
		int i = 0;
		if (!String.valueOf(replaceAll.charAt(0)).equals(string)) {
			String temp = string;
			string = string2;
			string2 = temp;
		}
		while (s.length() < replaceAll.length()) {
			if (i % 2 == 0) {
				s = s + string;
			} else {
				s = s + string2;
			}
			i++;
		}
		if (replaceAll.equals(s)) {
			return replaceAll.length();
		}
		return 0;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int l = Integer.parseInt(bufferedReader.readLine().trim());

		String s = bufferedReader.readLine();

		int result = alternate(s);

		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();
		//
		// bufferedReader.close();
		// bufferedWriter.close();
	}
}
