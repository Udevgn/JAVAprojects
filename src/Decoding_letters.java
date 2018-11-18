/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
		int T =  in.nextInt();
	    for(int t=0;t<T;t++){
	        int N =in.nextInt();
	        int code[] = new int[N];
	        Integer Code = Integer.valueOf(in.nextInt());
	        int base=10;
	        for(int i=N-1;i>=0;i-- )
	            {
	                code[i] = Code%10;
	                Code /= 10;
	                base = base*10;
	            }
	        int dp[] = new int[N+1];
	        dp[0] = 1;
	        dp[1]  =1;
	        for(int i=2;i<=N;i++){
	            if(code[i-2]<2)
	                dp[i] = dp[i-2]+dp[i-1];
	            else if(code[i-2]==2 && (code[i-1]<=6))
	                dp[i] = dp[i-2]+dp[i-1];
	            else 
	                dp[i] = dp[i-1];
	                
	            
	        }
	        System.out.println(dp[N]);
	       // for(int i=0;i<=N;i++)
	            //System.out.print(dp[i]+" ");
	            
	       // System.out.println();
	        
	    }
	}
}