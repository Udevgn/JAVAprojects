import java.util.*;

public class Stacks{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> s3 = new Stack<Integer>();
        int N = in.nextInt();
        for(int i=0;i<N;i++){
            s1.push(in.nextInt());
        }
        while(s1.empty() == false){
            
            int val = s1.pop();
           // System.out.println(val);
            if(s3.empty() && s2.empty())
                s3.push(val);
            else if((s2.empty()==false) && val>s2.peek()){
                while((s2.empty()==false) && val>s2.peek()){
                    s3.push(s2.pop());
                }
                s3.push(val);
            }
            else if((s3.empty()==false) && val<s3.peek()){
                while((s3.empty()==false) && val<s3.peek()){
                    s2.push(s3.pop());
                }
                s3.push(val);
            }
            else if((s3.empty()==false) && val >=s3.peek())
                s3.push(val);
        
        } 
            if(s2.empty()==false){
                while(s2.empty()==false){
                    s3.push(s2.pop());
                }
            }
         
            while(s3.empty()==false){
                System.out.print(s3.pop()+" ");
            }
            
            
    }
    
    
    
    
}