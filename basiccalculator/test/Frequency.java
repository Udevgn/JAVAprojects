import java.util.Scanner;
import java.util.Random;
public class Frequency {
  
    public static void main(String args []){
    int freq[] = new int[7];
   Random dice = new Random();
 for(int i=0;i<=1000;i++)
 {
     ++freq[1+dice.nextInt(6)];

    }
   for(int i=1;i<freq.length;i++){
        System.out.println(freq[i]);
   }
    
    }
  }  
    
   
