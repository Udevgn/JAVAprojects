package sorting;

public class Bubble 
{
    private int n;
    private int ar[] = null;
  public Bubble(int N,int AR[])
 {
        ar = AR;
        n = N;
 }
  int [] sort()
  {    int temp;
      for(int i=0;i<n;i++)
      {
       
       for(int j=0;j<n-i-1;j++)
       {
           if(ar[j]>ar[j+1])
           {
               temp = ar[j];
               ar[j]= ar[j+1];
               ar[j+1]=temp;
               
           }
           
       }
          
          
      }
      return ar;
   }
  
}
