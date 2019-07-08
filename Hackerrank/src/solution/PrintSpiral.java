package solution;

import java.util.Scanner;

public class PrintSpiral {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
          int finArr[][] = new int[m][n];
        for(int i =0;i<m;i++){
            for(int j = 0; j<n; j++){
                finArr[i][j] = scan.nextInt();

            }
        }
        
        int k = 0;
        int up = 0;
        int right = n-1;
        int down = m-1;
        int left = 0;
    
      
        while(k < m*n){
            for(int i=left;i<=right;i++){
                System.out.print(finArr[up][i]+" ");
                ++k;
                if(k == m*n)
                	break;
            }
            ++up;
            if(k == m*n)
            	break;
            for(int i = up ; i <=down ; i++){
                 System.out.print(finArr[i][right]+" ");
                 ++k;
                 if(k == m*n)
                 	break;
            }
            --right ;
            if(k == m*n)
            	break;
            for(int i = right;i>=left;i-- ){
                 System.out.print(finArr[down][i]+" ") ;
                 ++k;
                 if(k == m*n)
                 	break;
            }
            --down ;
            if(k == m*n)
            	break;
            for(int i = down; i>=up; i--){
                 System.out.print(finArr[i][left]+" ");
                 ++k;
                 if(k == m*n)
                 	break;
            }
            ++left ;
            if(k == m*n)
            	break;
        }
    }

}
