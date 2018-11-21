/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int gcd(int a,int b){
        if(b==0)
            return a;
            
        return gcd(b,a%b);
        
    }
    public static int jugs(int to,int from,int d,int n,int m){
        int k=1;
		    while(!(to==d||from==d)){
		        int temp = Math.min(from,n-to);
		        //System.out.println(from+"->"+to+"--");
		        k++;
		        from -= temp;
		        to += temp;
		       
		        if(from == d||to==d){
		            break;
		        }
		        if(to==n){
		            to = 0;
		            k++;
		        }
		        if(from==0){
		            from = m;
		            k++;
		        }
		    }
		    return k;
    }
    public static int min_steps(int m,int n,int d){
        if(m>n)
        {
            m = m+n;
            n = m-n;
            m = m-n;
        }
        if(d>n)
            return -1;
        if(d%gcd(m,n)!=0)
            return -1;
            
        return Math.min(jugs(0,m,d,n,m),jugs(0,n,d,m,n));
        
    }
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t=0;t<T;t++){
		    int m = in.nextInt();
		    int n = in.nextInt();
		    int d = in.nextInt();
		   // System.out.println(gcd(m,n));
		    int k = min_steps(m,n,d);
		    System.out.println(k);
		}
		    
		
	}
}