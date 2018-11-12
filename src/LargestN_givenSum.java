/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in  = new Scanner(System.in);
		int T = in.nextInt();
		for(int t=0;t<T;t++){
		    int N = in.nextInt();
		    int S = in.nextInt();
		    String number ="";
		    int curr_digit = 9;
		    if(S == 0)
		        {
		            System.out.println(-1);
		            continue;
		        }
		    while(N>0){
		        if(S<curr_digit){
		           while(S<curr_digit)
		             curr_digit--;
		        }
		        number = number+String.valueOf(Integer.valueOf(curr_digit));
		        S-=curr_digit;
		        N--;
		    }
		    if(S >0){
		        number ="-1";
		    }
		    System.out.println(number);
		}
	}
}