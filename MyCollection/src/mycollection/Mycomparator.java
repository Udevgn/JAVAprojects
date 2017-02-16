/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycollection;

import java.util.Comparator;

public  class Mycomparator implements Comparator<MyArrayList> {

    public int compare(MyArrayList o1, MyArrayList o2) {
       if(o1 == null || o2 == null)
           throw new NullPointerException("failed atempt to compare "+01+"with"+o2);
       else if(!(o1.getClass() == o2.getClass()))
           throw new ClassCastException();
        if(o1.price<o2.price)
        return -1;
        if(o1.price > o2.price)
        return 1;
        else
        return 0;
    }

    
    
    
    
    
    
}
