package javapractice;

//iterable -> main interface of java for collection it allows for each
// Iterable <T> iterator();
//collection -> add(), remove(), set(), size(), contains();

//list -> this interface maintain order of collections(element)
//maintain insertion order
//allow duplicates
//allow null values
//support indexing
//Arraylist -> actual implementation of Dynamic array
                        // Iterable(interface)
                        //      |
                        //      |
                        // collection(Interface)
                        //       |
                        //     list(interface)
                        //       |
                        // arrayList LinkedList(actual class of list)
//syntax for ArrayList ->
// List <Interger> list = new ArrayList<>();
// ArrayList<Integer>list = new ArrayList<>();
//LinkedList
//stack 
//queue
//set
//hashset
//hashmap

// import java.util.*;
// class Main{
//     public static void main(String[]args){
//         List <Integer> list=new ArrayList<>();
//         list.add(20);
//         list.add(12);
//         list.add(30);
//         list.add(40);
//         System.out.println(list);
//         list.add(2,50);
//         System.out.println(list);
//         System.out.println(list.get(3));
//     }
// }

// import java.util.*;
// class collection{
//     public static void main(String[]args){
//         List <Integer> list=new ArrayList<>();
//         list.add(20);
//         list.add(12);
//         list.add(30);
//         list.add(40);
//         System.out.println(list);
//         list.add(2,50);
//         System.out.println(list);
//         System.out.println(list.get(3));
//         int c=list.set(3,60);
//         System.out.println(list);
//         System.out.println(c);
//         System.out.println(list);
//         System.out.println(list.get(3));
//         System.out.println(list.remove(4));
//         System.out.println(list);
//         // remove the element from list using value
//         // list.remove(Integer.valueOf(value));
//         System.out.println(list.remove(Integer.valueOf(50)));
//         System.out.println(list);
        
//         //sort the list -> collections.sort(list)
//         Collections.sort(list);
//         System.out.println("sorted list is "+list);
        
//         //reverse the list collections.reverse(list)
//         Collections.reverse(list);
//         System.out.println(list);
//         //shuffle ,max,min, frequency(list, element)
//     }
// }

import java.util.*;
class collection{
    public static void main(String[]args){
        List <Integer> list=new ArrayList<>();
        list.add(20);
        list.add(12);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.add(2,50);
        System.out.println(list);
        System.out.println(list.get(3));
        int c=list.set(3,60);
        System.out.println(list);
        System.out.println(c);
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.remove(4));
        System.out.println(list);
        // remove the element from list using value
        // list.remove(Integer.valueOf(value));
        System.out.println(list.remove(Integer.valueOf(50)));
        System.out.println(list);
        // int d=list.contains(12);
        System.out.println(list.contains(12));
        int size=list.size();
        System.out.println("No of element in the list: "+size);
        // for (int num: list){
        //     System.out.println(num);
        // }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        // shuffle,max,min, frequency(list,element);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.max(list);
        System.out.println(Collections.max(list));
        // Collections.frequency(list,12);
        System.out.println(Collections.frequency(list,12));

    }
}
//sort the list

// shuffle,max,min, frequency(list,element);