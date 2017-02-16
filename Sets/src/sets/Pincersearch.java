package sets;
import java.lang.String;
import java.lang.System;
import java.util.HashSet;
import java.util.Scanner;
public class Pincersearch{
    HashSet<String> set = new HashSet<String>();
    Scanner in = new Scanner(System.in);
  System.out.println("enter 8 elements");
    for(int i=0;i<8;i++){
        String s = in.next();
        in.nextLine();
        set.add(s);
    }

}