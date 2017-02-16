package sorting;

public class Quick 
{
   int n;
   int ar[];
  public Quick(int N,int AR[])
  {
      n = N;
      ar = AR;
      
  }
  void quicksort(int ar[],int start,int end)
  {
      int pivot;
     pivot = quick(ar,start,end);
     quicksort(ar,start,pivot-1);
     quicksort(ar,pivot+1,end);
      
  }
   int  quick(int ar[],int start,int end )
    {  int pivot,pindex=0;
         pivot = ar[end];
       for(int i=0;i<end;i++)
       {
         if(ar[i]>pivot)
         {
           
          int temp = ar[i];
          ar[i] = ar[pindex];
          pindex++;
         }
       }
       int temp = ar[pindex];
       ar[pindex]=ar[end];
       ar[end]=temp;
         return pindex; 
    }
       int[] sort()
       {
           return ar;
       }


}
