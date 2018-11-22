import java.util.Scanner;

public class Nqueens{
	public static boolean isSafe(int N,int x,int y,int Board[][]){
		for(int i=0;i<N;i++)//checking for column
		{
			if(Board[i][y]==1)
				return false;
		}
		for(int i=x,j=y;i>=0 && j>=0;i--,j--){
				if(Board[i][j]==1)
				    return false;
		}
		for(int i=x,j=y;i>=0 && j<N;i--,j++){
				if(Board[i][j]==1)
				    return false;
		}
		return true;
	}
	public static int nqueens(int Board[][],int row,int N){
		if (row>=N)
			return 1;
		for(int i=0;i<N;i++){
			if(isSafe(N,row,i,Board)){
				Board[row][i] =  1;
				if(nqueens(Board,row+1,N) == 1)
					return 1;
				Board[row][i] =  0;
			}
		}
		return 0;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
	//	int N = in.nextInt();
	    int N = 8;
		int Board[][] = {
			{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0}
		};
	    int res  = nqueens(Board,0,8);
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		        System.out.print(Board[i][j]+" ");
		    }
		    System.out.println();
		}

	}
	

}