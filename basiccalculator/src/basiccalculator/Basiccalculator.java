package basiccalculator;
import java.util.Scanner;


public class Basiccalculator {

   
    public static void main(String[] args) {
        String oper;
        int a,b;
        boolean cont = true ;
  Scanner in = new Scanner(System.in);
  
  System.out.println("enter the operands ");
   a = in.nextInt();
  b= in.nextInt();
 while(cont){
 System.out.println("enter the operation to be performed ");
  oper = in.next().toString();
  switch(oper){
      case "*":   System.out.print("your result is ");
                  System.out.print(a*b);
                  break;
  
      case "+":   System.out.print("your result is ");
                  System.out.print(a+b);
                  break;
      case "-":   System.out.print("your result is ");
                  System.out.print(a-b);
                  break;
      case "/":   System.out.print("your result is ");
                  System.out.print(a/b);
                  break;
         }
        
 System.out.print("\nwanna do more calaculations??(press 1 to continue or 0 to exit ");
     cont = in.nextBoolean();
 
      }
     }
    }
