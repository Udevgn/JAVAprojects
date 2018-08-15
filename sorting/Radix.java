
package sorting;

public class Radix
{
    
    int n ;
    int ar[] = null;
    public Radix(int N,int AR[])
    {
        n =  N;
        ar = AR;
    }
      void radixsort(int ar[],int n )
      {
          int m = getMax(ar);
          for(int exp=1;m/exp>0;exp *=10)
          {
              countsort(ar,n,exp);
              
          }
          
          
      }
        int getMax(int ar[])
        {  int max =0;
            for(int k=0;k>ar.length;k++)
            {
                if(ar[k]>max)
                max = ar[k];
            }
            return max ;
        }
          void countsort(int ar[],int n,int exp)
          {   int output[] = new int[ar.length];
              int count[] = new int[10];
              for(int i=0;i<count.length;i++)
                  count[i] = 0;
              for(int i=0;i<ar.length;i++)
                  count[(ar[i]/exp)%10]++;
              for(int i=1;i<count.length;i++)
                  count[i] += count[i-1];
              for(int i=0;i<ar.length;i++)
              {
                  output[count[(ar[i]/exp)%10-1]] = ar[i];
                  count[(ar[i]/exp)%10-1]--;
              }
                  
           }
          int[] sort()
          {
              return ar;
          }
    
    }
