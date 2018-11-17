/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int T =in.nextInt();
		double mem[] = new double[10000];
		mem[0] = 1;
		mem[1] =1;
		
		for(int i=2;i<10000;i++){
		    mem[i]= (mem[i-1]+mem[i-2])%(Math.pow(10,9)+7);
		}
		for(int t=0;t<T;t++){
		    int N = in.nextInt();
		    double stair[] = new double[N+1];
		    stair[0] =1 ;
		    stair[1] = 1;
		    if(N>=10000){
		    for(int i=2;i<=N;i++){
		        
		        stair[i] = (stair[i-2]+stair[i-1])%(Math.pow(10,9)+7);
		    }
		    System.out.printf("%.0f\n",stair[N]%(Math.pow(10,9)+7));
		    }
		    else{
		    System.out.printf("%.0f\n",mem[N]%(Math.pow(10,9)+7));
		    }
		    
		}
	}
}