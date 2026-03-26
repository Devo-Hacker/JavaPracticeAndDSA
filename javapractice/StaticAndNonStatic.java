package javapractice;

//static and non static keyword
// any thign inside the class is static part of the class not the part of the object
//non-static is the part of the object
//Static can only access static 
//but non-static can access both static and non static
class Demo{
    static int a; //static variable
    int b=4;
    static void print(){
        System.out.println("the value of a is "+a);
        // System.out.println("the value of b is "+b);
    }
    void print1(){
        System.out.println("value of a is "+a);
        System.out.println("the value of b is "+b);
    }
    
    public static void main(String[]args){
        Demo d =new Demo();
        d.print();
        d.print1();
    }
    
}
//nested class -> class inside class
class outer{
    int a=20;
    static int b = 40;
    
    class inner{
        void print(){
            System.out.println("inner class method");
            System.out.println("value of a is "+a);
            System.out.println("value of b is "+b);
        }
    }
}
class Main{
    public static void main(String[]args){
        outer o =new outer();
        outer.inner obj = o.new inner();
        obj.print();
    }
}