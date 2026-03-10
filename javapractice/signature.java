package javapractice;
//method signature = method + params
// int add(int a, int b){
    
// }
// add(int, int)
// void add(int a, int b){
    
// }
// add(int, int)
// signature -> add(int, int)
//in signature -> data type, no of params, name of the function, order of the params
//dont consider in signature -> return type

// import java.util.*;
// class methodSignature{
//     int add(int a, int b){
//         System.out.println("sum is "+(a+b));
//         return (a+b);
//     }
//     void add(int a, double b){
//         System.out.println("sum is "+(a+b));
//     }
//     public static void main(String[] args){
//         methodSignature m1 = new methodSignature();
//         m1.add(2,3);
//     }
// }

// Method Overloading->
// function name should be same
// 1->change in no of parameter->

// void add(int a,int b){

// }
// // add(int,int)
// void add(int a,int b, int c){

// }
// // add(int,int,int)
// void add(int a,int b,int c,int d){

// }
// // add(int, int, int, int)

// // 2->change in data type of parameter


// void add(int a,int b){

// }
// // add(int,int)

// void add(int a,double b){

// }
// add(int,double)

//implement method overloading for area of different shape

//area(int ,int)
//area(int, double)
//area(double, double)
//area(double, int)
//area(int, int, int)
//area(int, double, int)
//area(int, double, double)
//area(double,double, double)

// import java.util.*;
// class methodOverloading{
//     void area(int a, int b){
//         System.out.println(a*b);
//     }
//     void area(double a, double b){
//         System.out.println(a*b);
//     }
//     void area(int a, double b){
//         System.out.println(a*b);
//     }
//     void area(double a, int b){
//         System.out.println(a*b);
//     }
//     void area(int a, int b, int c){
//         System.out.println(a*b*c);
//     }
//     void area(int a, double b, int c){
//         System.out.println(a*b*c);
//     }
//     void area(int a, double b, double c){
//         System.out.println(a*b*c);
//     }
//     void area(double a, double b, double c){
//         System.out.println(a*b*c);
//     }
//      public static void main(String[]args){
//         methodOverloading a=new methodOverloading();
//         a.area(20.76,50.40);
//         a.area(27.8,30);
//         a.area(30,35.98);
//         a.area(23.6,76.9,43.8);
//         a.area(12,45,34);
//         a.area(20,45.87,50);
//         a.area(20,27.56,87.90);
//     }
// }
import java.util.*;
class AmmiAbbu{
    void area(int a,int b){
        System.out.println("Area is "+(a*b));
    }
    void area(int a,double b){
        System.out.println("Area is "+(a*b));
    }
  
    void area(int a,int b,int c){
        System.out.println("Area is: "+(a+b+c));
    }
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        AmmiAbbu a=new AmmiAbbu();
        a.area(20,31.7);
        a.area(20,20);
        a.area(10,20,30);
        obj.close();
    }
}














