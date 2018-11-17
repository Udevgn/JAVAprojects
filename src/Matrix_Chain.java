/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static class Mat{
        int x;
        int y;
    }
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Mat mat[]  = new Mat[N];
		for(int i=0;i<N;i++)
		    {   mat[i] = new Mat();
		        mat[i].x = in.nextInt();
		        mat[i].y = in.nextInt();
		    }
		int Dp[][] = new int[N][N];
		for(int l=1;l<N;l++){
		    for(int k=1;k<=l;k++){
		        
		         for(int i=0;i+l<N;i++){
		            int temp= Dp[i][i+k-1]+mat[i].x*mat[i+k].x*mat[i+k].y+Dp[i+k][i+l];
		            if(Dp[i][i+l]==0 || Dp[i][i+l]>temp)
		                Dp[i][i+l]=temp;
		            
		        }
		        
		    }
		}
		System.out.println(Dp[0][N-1]);
		
		
	}
}