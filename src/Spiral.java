import java.util.Scanner;


public class Spiral{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int Mat[][] = new int[M][N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                Mat[i][j] = in.nextInt();
            }
        }
        N--;
        M--;
        int col = 0;
        int row = 0 ;
        while(row<M && col<N){
            
        for(int j=col;j<=N;j++)
            System.out.print(Mat[row][j]+" ");
        
        row++;
        
        for(int i=row;i<=M;i++)
            System.out.print(Mat[i][N]+" ");
            
        N--;
        for(int j=N;j>=col;j--)
            System.out.print(Mat[M][j]+" ");

        M--;
        
        for(int i=M;i>=row;i--)
            System.out.print(Mat[i][col]+" ");
        
        col++;
        
        }
            
        
        
    }
}
