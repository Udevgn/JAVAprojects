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
		    int K = in.nextInt();
		    int cost[] = new int[N];
		    for(int i=0;i<N;i++){
		        cost[i] = in.nextInt();
		    }
		    Arrays.sort(cost);
		    int min_cost =0;
		    int last_index =N-1;
		    int index=0;
		    while(index<=last_index){
		        min_cost += cost[index];
		        last_index -= K;
		        index++;
		    }
		    int max_cost =0;
		    Integer Cost[] = new Integer[cost.length];
		    for(int i=0;i<cost.length;i++){
		        Cost[i] = Integer.valueOf(cost[i]);
		    }
		    Arrays.sort(Cost,Collections.reverseOrder());
		    index =0;
		    last_index = N-1;
		    while(index<=last_index){
		        max_cost += Cost[index];
		        last_index -= K;
		        index++;
		    }
		    
		    System.out.print(min_cost+" "+max_cost);
		    System.out.println();
		}
	}
}