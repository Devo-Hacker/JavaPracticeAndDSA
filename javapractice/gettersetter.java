package javapractice;
//if you have runtime error
//can you remove easily

//we try to convert runtime to compile time error
//so we remove during the compilation phase

//reusability
//do you have any idea about getters and setters??
//with the help of getters and setter we can access private 

import java.util.*;
class Box<T>{
    private int a;
    public void setData(int a){
        this.a = a;
    }
    public int getData(){
        return a;
    }
    public static void main(String[]args){
        Box box = new Box();
        box.setData(45);
        System.out.println("value of a is "+box.getData());
        Integer num = (Integer)box.getData();
        System.out.println(num);
    }
}