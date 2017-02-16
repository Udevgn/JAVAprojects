/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycollection;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author DELL
 */
public class MySet {
    
    String arr[] = new String[50];
    Set<String> set = new HashSet<String>();
    MySet(){
        set.add("hello");
        set.add("hello");
        arr = set.toArray(arr);
    }
     void p(){
        System.out.println();
       System.out.println(set.hashCode());
        System.out.println(arr);
    }
}
