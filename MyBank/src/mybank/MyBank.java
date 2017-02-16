
package mybank;
import java.util.Scanner;
public class MyBank 
{
    
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      System.out.println("enter your user name ");
      String username = in.nextLine();
      System.out.println("enter your password");
      String password = in.nextLine();
      Database d = new Database(username,password);
      int check= d.search();
      if(check == -1)
      System.out.println("you are a new customer and have been added to our database");
      int c;
      System.out.println("enter 1)deposit\n2)withdraw\n3)transfer");
      c= in.nextInt();
      switch(c)
      {
          case 1:  System.out.println("enter the amount to be deposit");
          
      }
      
    
    
    
    }
    
}
