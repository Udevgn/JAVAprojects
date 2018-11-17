
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t=0;t<T;t++){
		    int N = in.nextInt();
		int coin_val[] = new int[N];
		for(int i=0;i<N;i++)
		    coin_val[i] = in.nextInt();
		int M = in.nextInt();
		int Dp[]  = new int[M+1];
		Arrays.sort(coin_val);
		Dp[0]= 1;
		for(int i=0;i<=M;i++)
		    {
		        if(i%coin_val[0]==0)
		            Dp[i]=1;
		    }
		for(int i=1;i<N;i++){
		    for(int j=1;j<=M;j++){
		        if(j>=coin_val[i])
		            Dp[j] += Dp[j-coin_val[i]];
		       
		       
		    }
		}
		
		System.out.println(Dp[M]);
		
		
		}
	}
}