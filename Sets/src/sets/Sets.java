package sets;
import java.util.Scanner;
public class Sets {

   public static void main(String[] args) 
    {
      /*Union u = new Union("abab","ab");
      System.out.println(u.Myunion1());*/
        String O[] = new String[100];
        Scanner in = new Scanner(System.in);
        String mylist1[] = new String[100];
        String mylist2[] = new String[100];
        short key =1  ;
        int z=0;
        while(key != 0)
        {
            System.out.printf("enter the entry no %d for list 1\n",z);
            mylist1[z++]= in.next();
            System.out.println("enter 1 if u want to continue else enter the 0\n");
            key  = in.nextShort();
        }
        key = 1;
        z=0;
          while(key != 0)
        {
            System.out.printf("enter the entry no %d for list 2\n",z);
            mylist2[z++]= in.next();
            System.out.println("enter 1 if u want to continue else enter the 0\n");
            key  = in.nextShort();
        }
        Union u = new Union(mylist1,mylist2);
        O = u.Myunion2();
        for(int l=0;l<O.length;l++)
            System.out.println(O[l]);

    }
    
}
