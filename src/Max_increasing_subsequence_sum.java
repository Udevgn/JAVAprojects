/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t=0;t<T;t++){
		    int N = in.nextInt();
		    int seq[]  = new int[N];
		    for(int i=0;i<N;i++)
		        seq[i] = in.nextInt();
		    int Dp[] = new int[N];
		    for(int i=0;i<N;i++)
		        Dp[i]= seq[i];
		    for(int i=1;i<N;i++){
		        for(int j=0;j<i;j++){
		            if(seq[i]>seq[j] && Dp[i]<Dp[j]+seq[i])
		                Dp[i] = Dp[j]+seq[i];
		        }
		    }
		    int max = 0;
		    for(int i=0;i<N;i++)
		        {   
		            if(Dp[i]>max)
		                max = Dp[i];
		        }
		    System.out.println(max);
		}
	}
}