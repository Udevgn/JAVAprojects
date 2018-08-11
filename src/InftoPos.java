package InfixtoPostfix;
import java.util.Scanner;
import java.util.Stack;
public class InftoPos {
     String postfix ="";
     String infix;
     Stack<Character> stack;
     public InftoPos(String infix){
        this.infix  = infix ; 
	stack = new Stack<Character>();
     }
      public int precedence(char c){
     	switch(c){
        	case('+'):
                case('-'):
                          return 1;
 
                case('/'):
                case('*'):
                          return 2;
 
                case('^'): 
 			  return 3;
 
                default  :
			  return -1;
        }
     }

     public String ItoP(){

     	for(int i=0;i<infix.length();i++){
		char ch = infix.charAt(i);

		if(Character.isLetterOrDigit(ch)){
			postfix += ch;
                } 
		else if(ch=='('){
			stack.push(ch);
		}
		else if(ch==')'){
			while(!stack.empty() && stack.peek()!='(')
				postfix += stack.pop();
			
			if(!stack.empty() && stack.peek()!='(')
				System.out.println("Invalid Expression!!!!");
			else
				stack.pop();
			
			
		}
		else {
			while(!stack.empty() && precedence(ch)<=precedence(stack.peek()))
				postfix += stack.pop();

			stack.push(ch);
		}
		
		
		
	}
		while(!stack.empty())
			postfix += stack.pop();
		return postfix;
     }
  
    /* public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
            String temp  = in.nextLine();
            InftoPos itp = new InftoPos(temp);
	    System.out.println(itp.ItoP());
            
     }*/

}