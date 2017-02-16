package sorting;
public class Selection 
{
    
int n;
int ar[] = null;
public Selection(int N,int AR[])
  {
   n = N;
   ar = AR;
  }
int[] sort()
 {
   
   for(int i=0;i<n;i++)
   {   int pos=0;
       int small = ar[i];
       for(int j=i+1;j<n;j++)
       {
           if(small>ar[j])
           {
               small = ar[j];
               pos=j;
               
           }
           
       }
       int temp = ar[pos];
       ar[pos] = ar[i];
       ar[i]=temp;
       
   }
    return ar;
    
 }



}
