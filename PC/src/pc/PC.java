
package pc;


public class PC {

 public static void main(String[] args) {
      
    Q q = new Q();
    Producer p = new Producer(q);
    Consumer c = new Consumer(q);
    System.out.println("press ctrl+c to exit");
 }
    
}
