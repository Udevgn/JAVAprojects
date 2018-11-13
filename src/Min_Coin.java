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
		    int amount = in.nextInt();
		    int DP[] = new int[amount+1];
		    DP[0]=1;
		    int denomination[] = new int[N];
		    for(int i=0;i<N;i++)
		        denomination[i] = in.nextInt();
		    Arrays.sort(denomination);
		    for(int i=1;i<amount+1;i++)
		        DP[i] = 999999;
		    for(int i=1;i<N;i++)
		        if(denomination[i]<=amount)
		            DP[denomination[i]] = 1;
		    for(int i=0;i<N;i++){
		        for(int j=1;j<=amount;j++){
		            if(j>=denomination[i])
		                DP[j]= Math.min(DP[j-denomination[i]]+1,DP[j]);
		        }
		    }
		    if(DP[amount] != 999999)
		    System.out.println(DP[amount]);
		    else
		    System.out.println(-1);
		}
	}
}