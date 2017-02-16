
package pc;

public class Q 
{  int n;
   private boolean flag = true ;
   public/* synchronized */ void put(int n)
   {
      // while(flag) {
          /* try
            {
              wait();
            }catch(InterruptedException e)
               {
                   System.out.println("exception is caugt"+e);
               }*/
          
       // }
                    
               this.n = n;
               System.out.println("put"+n);
             //  flag = true ;
              // notify();
       
   }
    public /* synchronized */ void get()
   {
      // while(!flag)
      // {
          /* try
            {
              wait();
            }catch(InterruptedException e)
               {
                   System.out.println("exception is caugt"+e);
               }*/
          
       // }
                    
               this.n = n;
               System.out.println("got"+n);
          //     flag = false ;
              // notify();
       
   }
}
