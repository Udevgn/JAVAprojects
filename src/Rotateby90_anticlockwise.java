import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = n;
		int mat[][] = new int[n][m];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<m;j++){
		        mat[i][j] = in.nextInt();
		    }
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		    if(i<j){
		        mat[i][j] = mat[i][j]+mat[j][i];
		        mat[j][i] = mat[i][j]-mat[j][i];
		        mat[i][j] = mat[i][j]-mat[j][i];
		    }
		    }
		}
			for(int j=0;j<m;j++){
		    int i=0;
		    while(i<n-i-1){
		        mat[i][j]=mat[n-i-1][j]+mat[i][j]; 
		        mat[n-i-1][j] = mat[i][j]-mat[n-i-1][j];
		        mat[i][j]=mat[i][j]-mat[n-i-1][j];
		        i++;
		    }
		}
		for(int i =0;i<n;i++){
		    for(int j=0;j<m;j++){
		        System.out.print(mat[i][j]+" ");
		    }
		    System.out.println("\n");
		}
	}
}