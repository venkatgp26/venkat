package solution;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ClimbingTheLadder {

    // Complete the climbingLeaderboard function below.
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		List<Integer> li = new ArrayList<>();
		int[] ret = new int[alice.length];
		for (int i = 0; i < scores.length; i++) {
			if (!li.contains(scores[i])) {
				li.add(scores[i]);
			}
		}
		for (int i = 0; i < alice.length; i++) {
			if (!li.contains(alice[i])) {
				li.add(alice[i]);
				Collections.sort(li, Collections.reverseOrder());
			}
			ret[i] = li.indexOf(alice[i]) + 1;
			//System.out.println(li);
		}

		// System.out.println(li);
		//System.out.println(Arrays.toString(ret));
		return ret;

	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
