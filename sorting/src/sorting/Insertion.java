
package sorting;
public class Insertion 
{
  
    int n;
    int ar[]= null;
    
    public Insertion(int N,int AR[])
 {
        n = N;
        ar = AR;
        
        
 }
    int[] sort()
   {
      int j=0,key=0;
      for(int i=0;i<n;i++)
      {
        j=i-1;
        key=ar[i];
        while(j!=-1 && ar[j]>key)
        {
          ar[j+1] = ar[j];
          j--;
        }
        ar[j+1] = key;
       }
      return ar;
    }
}
