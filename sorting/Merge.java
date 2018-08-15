
package sorting;

public class Merge 
{
    
    int n;
    int ar[];
    int left,right;
    
  public Merge(int N,int AR[])
  {
     n = N;
     ar = AR;
     left = 0;
     right = n-1;
  }
   void sort(int ar[],int left ,int right)
   {
    int mid;
    int buff[] = null;
     mid = (left+right)/2 ;
     if(right> left)
     {
       sort(ar,left,mid);
       sort(ar,mid+1,right);
       merge(ar,buff,left,mid,right);
         
     }
   }     
  void merge(int A[] = null,int temp[] = null,int l=0,int m=0,int r=0)
      {  int i= l;
         int left_end = m-1;
         while(l<=left_end && m<right)
         {
          if(A[l]<A[m])
          {
                temp[i++] = A[l];
                l++;
          }
            else
            {
             temp[i++] = A[r];
             r++;
            }
              while(l<=left_end)
              {
                temp[i++] = A[l++];
              }
                while(r<=right)
                {
                   temp[i++] = AR[r++]; 
                    
                }
        
        
          }   
      }
}

