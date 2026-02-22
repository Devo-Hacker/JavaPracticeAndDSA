package javapractice;
 import java.util.*;
 public class Main {
     public static void main(String[] args){
         System.out.println("Hi!");
         System.out.println("Welcome to my life");

        
         int myNum = 5;               // Integer (whole number)
         float myFloatNum = 5.99f;   // Floating point number
         char myLetter = 'D';        // Character
         boolean myBool = true;      // Boolean
         byte myByte = 100;          // Byte
         short myShort = 5000;       // Short
         long myLong = 15000000000L; // Long
         double myDouble = 19.99d;   // Double precision floating point number

         //reference datatypes
         String myText = "Hello";    // String


         System.out.println(myNum);
         System.out.println(myFloatNum);
         System.out.println(myLetter);
         System.out.println(myBool);
         System.out.println(myByte);
         System.out.println(myShort);
         System.out.println(myLong);
         System.out.println(myDouble);
         System.out.println(myText);
        
         //getting user input
         Scanner s = new Scanner(System.in);

        String name;
         System.out.println("Enter your name: ");
        name = s.nextLine();  //we use nextLine() to take string input with spaces or any kind of characters
         System.out.println("Hello "+ name);
        System.out.println("Enter your age: ");
         int age = s.nextInt();
         System.out.println("your age is: "+ age);

         s.close();


     }

 }

//  import java.util.*;

// // // class Main{

// // //     public static void main(String[]args){
// // //         System.out.println(Integer.MAX_VALUE);
// // //         System.out.println(Integer.MIN_VALUE);
// // //         System.out.println(Integer.BYTES);
// // //         System.out.println(Integer.SIZE);

// // //         int a=4;
// // //         System.out.println(a);
// // //         Integer obj=a;
// // //         System.out.println(obj);

// // //         int b=obj;
// // //         //auto unboxing
// // //         System.out.println(b);

// // //         int c = obj.intValue();
// // //         System.out.println(c);

        
// // //     }
// // // }

// // import java.util.*;
// // class integer{
// //      public int value;
// //         public int BYTES=4;
// //         public int SIZE=32;
// //         public int MAX_VALUE=2147483647;
// //         public int MIN_VALUE=-2147483648;
// //         Integer(int value){
// //             this.value=value;
// //         }

// //         public int intValue(){
// //             return value;
// //         }
// // }

// import java.util.*;
// class Main{
//     public static void main(String[]args){
//      //program to print from 1 to 100 using loop
//     //  for(int i=1; i<=100; i++){
//     //     System.out.println(i);
//     //  }
//     //     int n;
//         Scanner s=new Scanner(System.in);
//         // n = s.nextInt();
//         // for(int i=1; i<=n; i++){
//         //     System.out.println(i);
//         //  }
//         //  s.close();
//         //     for(int i=100; i>=1; i--){
//         //         System.out.println(i);
//         //     }

//         // int even;
//         // even = s.nextInt();
//         // for(int i=2; i<=even; i+=2){
//         //         System.out.println(i);
//         // }

//         // int input;
//         // input = s.nextInt();
//         // int sum =0;
//         // for(int i=1; i<=input; i++){
//         //     sum = sum + i;
//         // }
//         // System.out.println(sum);
        
//         //table of number n
//         // int table;
//         // table = s.nextInt();
//         // for(int i=1; i<=10; i++){
//         //     System.out.println(table*i);
//         // }

//         // //Take integer as an input and print sum of all digits of that number.
//         // int number;
//         // number = s.nextInt();
//         // int sum =0;
//         // while(number>0){
//         //     int rem = number % 10;
//         //     sum = sum + rem;
//         //     number = number /10;
//         // }
//         // System.out.println(sum);

//         // //Reverse of a number
//         // int num;
//         // num = s.nextInt();
//         // int reverse =0;
//         // while(num>0){
//         //     int rem = num % 10;
//         //     reverse = reverse * 10 + rem;
//         //     num = num /10;
//         // }
//         // System.out.println(reverse);

//         //check given number is even or odd;
//         // int even;
//         // even = s.nextInt();
//         // if(even % 2 ==0){
//         //     System.out.println("Even");
//         // }
//         // else{
//         //     System.out.println("Odd");
//         // }

//         //check if the given number is palindrome or not
//         // int palindrome;
//         // palindrome = s.nextInt();
//         // int orignial = palindrome;
//         // int reverse =0;
//         // while(palindrome>0){
//         //     int rem = palindrome % 10;
//         //     reverse = reverse * 10 + rem;
//         //     palindrome = palindrome /10;
//         // }
//         // if(orignial == reverse){
//         //     System.out.println("Palindrome");
//         // }
//         // else{
//         //     System.out.println("Not a Palindrome");
//         // }

//         // int number;
//         // number = s.nextInt();
//         // for(int i=0; i<number; i++){
//         //     for(int j=0; j<number; j++){
//         //         System.out.print("*");
//         //     }
//         //     System.out.println();
//         // }

//         //  int number;
//         // number = s.nextInt();
//         // for(int i=0; i<number; i++){
//         //     for(int j=0; j<i+1; j++){
//         //         System.out.print("*");
//         //     }
//         //     System.out.println();
//         // }

//         //check if a number is prime or not 
        
//         // int prime;
//         // prime = s.nextInt();
//         // boolean isPrime = true;
//         // for(int i=2; i<)

//         //find the factorial of a number using for loop
//         // int number;
//         // number = s.nextInt();
//         // int factorial =1;
//         // for(int i=1; i<=number; i++){
//         //     factorial = factorial * i;
//         // }
//         // System.out.println(factorial);

//         //convert integer to binary without using inbuilt function
//         // int intbin;
//         // intbin = s.nextInt();
//         // int binary =0;
//         // int value = 1;
//         // while(intbin>0){
//         //     int rem= intbin%2;
//         //     binary= binary + rem * value;
//         //     intbin = intbin/2;
//         //     value = value*10;
//         // }
//         // System.out.println(binary);

//         //print fibonacci series up to n terms
//         // int fibonacci;
//         // fibonacci = s.nextInt();
//         // int a=0, b=1;
//         // for(int i=1; i<=fibonacci; i++){
//         //     System.out.println(a);
//         //     int c = a + b;
//         //     a = b;
//         //     b = c;,
//         // }
        
//         // int []arr = {10,20,30,40,50};
//         // int n = arr.length;
//         // System.out.println("size of the array "+ n);
//         // //print the array
//         // for(int i=0;i<n;i++){
//         //     System.out.println(arr[i]+" ");

//         // };
//         // System.out.println();
//         // for(int i:arr){
//         //     System.out.println(i+ " ");
//         // }
//         // //find the sum of all elements using loop and for each loop
//         // int sum = 0;
//         // for(int i=0; i<n; i++){
//         //     sum+=arr[i];
//         // }
//         // System.out.println(sum);

//         // int sum1=0;
//         // for(int it:arr){
//         //     sum1+=it;
//         // }
//         // System.out.println(sum);


//         // //check each element one by one if it is even or odd
//         // for(int it:arr){
//         //     if(it%2==0){
//         //         System.out.println("is even");
//         //     }
//         //     else{
//         //         System.out.println("is odd");
//         //     }
//         // }

//         // //write the code to reverse the array
//         // int low = 0;
//         // int high = n-1;
//         // while(low<=high){
//         //     int temp=arr[low];
//         //     arr[low] = arr[high];
//         //     arr[high]=arr[low];
//         //     low++;
//         //     high--;
//         // }
//         // System.out.println("reverse array: ");
//         // for(int i=0; i<n; i++){
//         //     System.out.println(arr[i]);
//         // }

//         // //linear search
//         // int target = s.nextInt();
//         // int found = 0;
//         // for(int i=1; i<n; i++){
//         //     if(arr[i]==target){
                    
//         //     }
//         // }

//         System.out.println();
//         int m=s.nextInt();
//         int [][]
//         s.close();
//     }
// }

// import java.util.*;
// class Student{
//    // fields 
//    String name;
//    int roll_no;

//    // constructure -> type of method that don't have return type
//    // called automatically -> initailize varaiable
//    // name of constructure will same as class name 
//    Student(String name, int roll_no)
//    {   //this means object of class
//       this.name=name;
//       this.roll_no=roll_no;
//    }

//    //methods (functions)
//    void display()
//    {
//       System.out.println("Student name is " + name);
//       System.out.println("Student roll no is "+ roll_no);
//    }
// }
// class main{
//    public static void main(String[]args)
//    {
//       Student s1=new Student("Arun",35);
//       s1.display();

//    }
// }

// import java.util.*;
// class Employee{
//    String name;
//    double baseSalary;

//    Employee(String name, double baseSalary)
//    {
//       this.name=name;
//       this.baseSalary=baseSalary;
//    }
//    void total_salary(double p_hra,double p_da)
//    {
//       double hra=p_da*baseSalary;
//       double da=p_da*baseSalary;

//       double total=baseSalary+hra+da;
//       System.out.println(" total salary is "+ total);
//    }
// }
// class main{
//    public static void main(String[]args)
//    {
//       Employee e1=new Employee(" arun",1000);
//       e1.total_salary(.20,.10);
//    }
// }
// import java.util.*;
// class functionoverloading{
//     void area(double a, double b){
//         System.out.println("area will be "+a*b);
//     }

//     void area(int a, int b, int c){
//         System.out.println("area will be "+(a*b*c));
//     }

//     public static void main(String[] args){
//         functionoverloading obj= new functionoverloading();
//         obj.area(3.1,3.2);
//         obj.area(3, 4,5);
//     }
// }

