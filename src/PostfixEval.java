import java.util.Stack;
import java.util.Scanner;
import java.util.EmptyStackException;
import java.lang.Math;
import InfixtoPostfix.InftoPos;
public class PostfixEval {
	Stack<Double> stack;
	double result;
	boolean isOperator(char ch){
		if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^')
			return true;
		return false;
	}
	public double Evaluate(String postfix){
		stack = new Stack<Double>();
		for(int i=0;i<postfix.length();i++){
			char ch  = postfix.charAt(i);
			//System.out.println(stack+" "+ch);
			if(Character.isDigit(ch)){
				stack.push(Double.valueOf(ch-'0'));
			}
			else if(isOperator(ch)){
				Double op1 = stack.pop();
				Double op2 = stack.pop();
				double temp=0.0f;
				if(ch == '+'){
					temp = op1+op2;
					stack.push(temp);
				}
				else if(ch  == '-'){
					temp = op1-op2;
					stack.push(temp);
				}
				else if(ch == '*'){
					temp = op1*op2;
					stack.push(temp);
				}
				else if(ch == '/'){
					temp = op1/op2;
					stack.push(temp);
				}
				else if(ch == '^'){
					temp = Math.pow(op1,op2);
					stack.push(temp);
				}
					 
			}
		}
		return stack.pop();
        }
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
            String temp  = in.nextLine();
	    String res="";
            InftoPos itp = new InftoPos(temp);
	    try {
	    	res = itp.ItoP();
	    }
	    catch(EmptyStackException e){
		System.out.println("Bad Expression!!");
	    }
	    PostfixEval pe = new PostfixEval();
	    System.out.println(res);
	    System.out.println("Result:"+pe.Evaluate(res));
	}

}