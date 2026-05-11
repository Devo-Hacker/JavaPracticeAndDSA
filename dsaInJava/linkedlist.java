package dsaInJava;

import java.util.*;
class Main{
    public static void main(String[] args){
        LinkedList<Integer>list=new LinkedList<>();
        
        list.add(10);
        list.add(20);
        list.add(67);
        System.out.println(list);
        
        System.out.println("no of elements in linkedl"+ list.size());
        
        //to delete the data from linkedlist
        //we have remove method
        
        list.remove(1);
        System.out.println(list);
        
        list.remove(Integer.valueOf(67));
    }
}