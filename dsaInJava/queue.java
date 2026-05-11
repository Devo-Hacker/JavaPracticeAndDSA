package dsaInJava;

// Queue -> in java it is collection -> 
// FIFO or LILO 

// if remove the element from Queue it will remove from front of Queue
// if we insert element it will insert from back side 

// we have same method like LinkedList 

// to Create the Queue
 
 // Queue<Integer>q=new LinkedList<>();
 
 import java.util.*;
 class Main{
     public static void main(String[]args)
     {
         Queue<Integer>q=new LinkedList<>();
         
         // to add the element in Queue 
         // name.add(20);
         //name.add(89);
         q.add(20);
         q.add(89);
         // in case of Queue add(data)  offer(data) 
         // offer(data) perform insertion of element safely 
         q.offer(78);
         q.offer(34);
         System.out.println(q);
         
         // to delete the we  have remove() ->it will delete from front
         q.remove();
         System.out.println(q);
         
         // remove()and poll()   method both are same -> 
         // but poll method provide safety in deltion 
         q.poll();
         System.out.println(q);
         
         
         //  size()  
         System.out.println("size of Queue is " + q.size());
         
         // contains 
         System.out.println(q.contains(34));
         
         
         
     }
 }