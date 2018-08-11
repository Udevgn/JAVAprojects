import java.util.Arrays;
interface Stack_Methods {
   void push(char c);
   char pop();
   char peek();
   void increase_stack();
   void show_Stack();
   void set_StackLength(int len);
   int get_StackLength();
}
class Stack implements Stack_Methods{
    int top;
    int LEN;
    char chars[];
    Stack (int len){
      top=0;
      set_StackLength(len);
      chars = new char[LEN];
    }
    public void push(char c){
         if(top<LEN)
           chars[top++] = c; 
	 else{
           increase_stack();
	   chars[top++]=c;
         }
    }
    public char pop(){
	if(top>=0)
		return chars[top--];
	return '#';
    }
    public char peek(){
      if(top>=0 && top <=LEN)
	return chars[top];
      return '#';
    }
    public void increase_stack(){
         if(top>=LEN){
         char temp[] = Arrays.copyOf(chars,LEN);
         chars= new char[LEN+1];
         for(int i=0;i<LEN;i++)
		chars[i] = temp[i];
           LEN +=1;
         }
    }
    public void show_Stack(){
         int i = top-1;
         while(i>=0){
		System.out.println(chars[i--]);
         }

    }
   public void set_StackLength(int len){
         LEN = len;
   }
   public int get_StackLength(){
        return LEN;
   }
         
}
public class Stack_Imp {

 public static void main(String args[]){
             Stack stack = new Stack(1);
             stack.push('h');
             stack.push('s');
             stack.push('r');
             stack.push('a');
             stack.push('k');
             stack.push('t');
             stack.push('u');
             stack.show_Stack();
  
 }

}