package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SpiralPattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		List<Integer> li = new ArrayList<>();
		for(int i =0;i<m;i++){
			for(int j = 0; j<n; j++){
				int w = scan.nextInt();
				li.add(w);
			}
		}
		
		int k = 0;
		int up = 0;
		int right = n-1;
		int down = m-1;
		int left = 0;
	
		int finArr[][] = new int[m][n];
		while(k < m*n){
			for(int i=up;i<=right;i++){
				finArr[up][i] = li.get(k++);
			}
			++up;
			for(int i = up ; i <=down ; i++){
				finArr[i][right] = li.get(k++);
			}
			--right ;
			for(int i = right;i>=left;i-- ){
				finArr[down][i] = li.get(k++) ;
			}
			--down ;
			for(int i = down; i>=up; i--){
				finArr[i][left] = li.get(k++);
			}
			++left ;
		}
			
		//System.out.println(Arrays.deepToString(finArr));
		for(int i = 0;i<finArr.length;i++){
			for(int j = 0; j<finArr[i].length;j++){
				System.out.print(finArr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
