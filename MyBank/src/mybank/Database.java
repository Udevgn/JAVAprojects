
package mybank;
public class Database 
{
    public  static String[][] clist = null;
    static int k=0;
    String user,pass;
    Database(String username,String password)
    {
        this.user = username ;
        this.pass = password ;
    }
    int search()
    {
       String tuple[]  = new String[2];
       tuple[0] = user;
       tuple[1] = pass;
       int flag = 0;
       for(String[] temp: clist)
       {
         if(temp[0].equals(user) && temp[1].equals(pass))
         flag =1;
             
       }
       if(flag == 0)
       {
           clist[k++] = tuple ;
           return 1;
       }
       if(flag == 1)
           return -1;
       return -1;
    }
    
}
