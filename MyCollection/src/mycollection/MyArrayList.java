package mycollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
public class MyArrayList 
{
    ArrayList<String> mylist1;
    ArrayList<String> mylist2;
    String str1[] ;
    String str2[];
    String car ;
    float price;
    MyArrayList(String car,float price)
    { 
        this.car = car;
        this.price = price ;
            
    }
    void function()
    {
    mylist1 = new ArrayList<String>();
    mylist2 = new ArrayList<String>();
      for(String temp: str1)
      mylist1.add(temp);
      for(String temp: str2)
      mylist2.add(temp);
    } 
    ArrayList<String> Union()
    {   //ArrayList<String> op = new ArrayList<String>();
        //op = mylist1;
        Iterator<String> it =  mylist2.iterator();
        while(it.hasNext())
        {   String t = it.next();
            if(mylist1.contains(t))
            continue;
            else 
            mylist1.add(t);
        }
        return mylist1;
    }
    ArrayList<String> Intersection()
    {  // ArrayList<String> op = new ArrayList<String>();
       //op = mylist1;
        Iterator<String> it =  mylist2.iterator();
        while(it.hasNext())
        {   String t = it.next();
            if(mylist1.contains(t))
               continue;
            else 
            mylist1.clear();
        }
        return mylist1;
    }
    public String toString(){
        return "name:"+this.car+"price:"+this.price;
    }
    
}
