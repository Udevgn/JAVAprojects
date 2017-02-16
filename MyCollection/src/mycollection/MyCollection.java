
package mycollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MyCollection 
{
    
    public static void main(String[] args)
    {  
        Set<Integer> set = new HashSet<Integer>();
        
        
       String arg1[] = {"hello","baby","how","are","you"};
       String arg2[] =  {"baby","you","are","u"};
       
      // MyArrayList O = new MyArrayList(arg1,arg2);
       // ArrayList<String> ml = O.Union();
       // for(String  temp: ml)
         //   System.out.println(temp);
   /*   
        LinkedList<String> myllist = new LinkedList<String>();
        myllist.add("a");
        myllist.add("1");
        myllist.add("b");
        myllist.add(1,"c");
        p(myllist.toString());
        List<String> myllist2 = Arrays.asList(arg2);
        myllist.addAll(myllist2);
        p(myllist.toString());
        myllist.addAll(0,myllist2);
        p(myllist.toString());
        myllist.addFirst("hello");
        p(myllist.toString());
        myllist.addLast("world");
        // p("clearing the data of list2");
        //myllist2.clear();
        p(myllist2.toString());
        p("cloning the firstlist");
        myllist2 = (LinkedList<String>)myllist.clone();
        p("content of list2");
        p(myllist2.toString());
        myllist2.remove("hello");
        p(myllist.toString());
        p(myllist2.toString());
        p(myllist.contains("hello")+" ");
     //   myllist.l
        
        */
   Integer a[] = {3,5,1,7,8,3,2,1,98,56,34,21,26,57};
   List<Integer> l = Arrays.asList(a);
        Collections.sort(l);
        p(l+"");
       // Collections.;
   ArrayList<MyArrayList> c= new ArrayList<MyArrayList>();
  // c.add(new MyArrayList("z",100000));
  // c.add(new MyArrayList("a",150000));
  for(int i=0;i<100;i++){
      c.add(new MyArrayList("car",i));
  }
  // Mycomparator mc = ;
   Collections.sort(c,new Mycomparator());
   for(MyArrayList m: c){
       p(m+"");
   }
   MyArrayList carx = new MyArrayList("xar",45);
   Collections.rotate(c,33);
  p(Collections.binarySearch(c, carx, new Mycomparator())+"");
     p(c.toString()); 
     Collections.shuffle(c);
     p(c.toString());
    // Collections.
   MySet myset = new MySet();
   myset.p();
        
        
        
    }
       static  void p(String str){
        System.out.println(str);
    }
    
}
