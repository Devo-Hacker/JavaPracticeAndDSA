package javapractice;
// Static and non-Static keyword 
// any thing inside the class is static part of class not part of object 
// non-static is part of object 
// import java.util.*;
// static can acess only static 
// non-static can access both static and non-static 
// class Demo{
//     static int a; //static variable 
//     int b=4;
//     static void print()
//     {
//         System.out.println("value of a is " + a);
//        // System.out.println("value of b is " + b);
//     }
//     void print1()
//     {
//         System.out.println("value of a is " + a);
//        System.out.println("value of b is " + b);
//     }
// }
// class main{
//     public static void main(String[]args)
//     {
//         Demo d=new Demo();
//         d.print();
//         d.print1();
//     }
// }




//Nested Class -> class inside the class 
// import java.util.*;
// class outer{
//     int a=20;
//     static int b=40;
//     // non-static
//     class Inner{
//         void print()
//         {
//             System.out.println("inner class method");
//             System.out.println("value of a is " + a);
//             System.out.println("value of b is " + b);
//         }
//     }
// }
// class main{
//     public static void main(String[]args)
//     {
//         outer o=new outer();
//         outer.Inner obj=o.new Inner();
//         obj.print();
//     }
// }



// static class inside any class -> nested class 

// import java.util.*;
// class Outer{
//     int a=5;
//     static int b=40;
//     static class Inner{
//         void display()
//         {
//            // System.out.println("value of a is "+ a);
//             System.out.println("value of b is "+ b);
//         }
//     }

// }
// class main{
//     public static void main(String[]args)
//     {
//         Outer.Inner obj=new Outer.Inner();
//         obj.display();

//     }
// }


//Nested class 
//1. non-static 
//2. static nested class
//3. local inner class
//4. anonymous nested class

// local inner class
// outer class -> method od outer -> inner class -> method of inner class 
// we can hide inner class in outer class with the help of local inner class 

// class Outer {
//     void show()
//     {
//         class Inner{
//             int a=4; //variables will be final . we can not change value 

//             void print()
//             {
//                 System.out.println("value of a is " + a);
//             }
//         }
//         Inner obj=new Inner();
//         obj.print();

//     }
// }
// class main{
//     public static void main(String[]args)
//     {
//         Outer o=new Outer();
//         o.show();
//     }
// }

// anonymous nested class 
// we don't have class name 
// at time of class dec;aration we create object 
// this only for one time use
// event handling -> just click on button 

// interface Demo{
//     void print();
// }
// class main{
//     public static void main(String[]args)
//     {
//         Demo d=new Demo(){
//             public void print()
//             {
//                 System.out.println("anonymous class");

//             }

//         };
//         d.print();
//     }
// }

//Nested class Question 
//outer class -> Section 
//in Section we have 
//static sectionName varaible 
//nested Ststic Inner class -> Student 
// in Inner class we student name , RollNo marks 
// method showdetails();
// implements nested class and create two student object 
// class Section {
//     static String sectionName="324AK";
//     static class Student{
//         String StudentName;
//         int RollNo;
//         int marks;
//         Student(String StudentName, int RollNo,int marks)
//         {
//             this.StudentName=StudentName;
//             this.RollNo=RollNo;
//             this.marks=marks;

//         }
//         void showdetails()
//         {
//             System.out.println("Section Name is " + sectionName);
//             System.out.println("StudentName is " + StudentName);
//             System.out.println("RollNo is " + RollNo);
//             System.out.println("marks is " + marks);
//              }

//         }

//     }
//     class main{
//         public static void main(String[]args)
//         {
//             Section.Student s1=new Section.Student("Arun " ,234,89);
//             s1.showdetails();

//         }
//     }


//Utility class -> in Utility every method is static 
// we don't create the object of Utility class
//that why constructure will be private 
// we can access method with help of class name 
// math utility 
// String Utility 
// date and time Utility 
// class Mathutility{
//     private Mathutility()
//     {

//     }
//     static void add(int a, int b)
//     {
//         System.out.println("sum of a and b is " + (a+b));
//     }
//     static void multi(int a,int b)
//     {
//         System.out.println("multiply of a and b is " + (a*b));
//     }
//     static void max(int a,int b)
//     {
//         if(a>b)
//         {
//             System.out.println("maximum is "+a);
//         }
//         else{
//             System.out.println("maximum is " + b);
//         }
//     }

// }
// class main{
//     public static void main(String[]args)
//     {
//         Mathutility.add(2,3);
//         Mathutility.multi(3,4);
//         Mathutility.max(23,67);
//     }
// }

//String utility class
class StringUtility{
    private StringUtility()
    {

    }
    static void printname(String name)
    {

    }
    static void reverse(String name)
    {
        
    }
}