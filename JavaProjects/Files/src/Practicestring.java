//import java.lang.*;

public class Practicestring 
{
    
    public static void main(String args[]){
    char chars[] = {'a','b','c','d','e','f'};
    char bytes[] = {(int)'a',(int)'b',(int)'c',(int)'d',(int)'e',(int)'f'};
    
    String mystring1 = new String(chars,2,3);
    String mystring2 = new String(chars,0,3);
    String mystring3 = new String(chars,0,chars.length);
    
    String mystring4 = new String(bytes,2,3);
    String mystring5  = new String(bytes,0,3);
    String mystring6  = new String(bytes,0,chars.length);
    for(int i=0;i<mystring6.length();i++)
    {
        System.out.print(mystring6.charAt(i)+ " ");
        System.out.print(mystring3.charAt(i)+ " ");
        
        
        
    }
    
    String mystring7 = "123456";
    
    mystring7.getChars(0,mystring6.length()-1,mystring6.toCharArray(),0);
    
    
    }
    
    
    
    
    
    
    
    
    
}
