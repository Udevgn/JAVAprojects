/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static class Jobs{
        int group_size;
        int job_id;
        int deadline;
        int profit;
    }
    static class Jobs_Comparator implements Comparator<Jobs>{
           public int compare(Jobs  j1,Jobs j2){
		            if(j1.deadline>j2.deadline){
		                return 1;
		            }
		            else{
		                return -1;
		            }
		        }
    }
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t=0;t<T;t++){
		    int N = in.nextInt();
		    Jobs job[] = new Jobs[N];
		    for(int i=0;i<N;i++){
		        job[i] = new Jobs();
		        job[i].job_id = in.nextInt();
		        job[i].deadline = in.nextInt();
		        job[i].profit = in.nextInt();
		    }
		    Arrays.sort(job,new Jobs_Comparator());
		    Integer DP[] = new Integer[N];
		    DP[0] = job[0].profit;
		    for(int k=1;k<N;k++){
		        DP[k]=job[k].profit;
		    }
		    for(int i=1;i<N;i++){
		      //  System.out.println(i);
		        for(int j=0;j<i;j++){
		            if(job[i].deadline>job[j].deadline && (DP[j]+job[i].profit>DP[i])){
		                //System.out.println(DP[j]+" "+DP[i]);
		                DP[i] = DP[j]+job[i].profit;
		                job[i].group_size += job[j].group_size 
		            }
		                
		        }
		    }
		    int max_profit = Collections.max(Arrays.asList(DP));
		    System.out.println(Arrays.toString(DP)+" "+max_profit);
		    
		}
	}
}