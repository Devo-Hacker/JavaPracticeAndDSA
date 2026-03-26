package javapractice;


//  Online Food Delivery System

// Design an Online Food Delivery System using Java OOP concepts. Requirements: 1. Create an
// abstract class Order with fields: customerName, amount. 2. Include abstract method placeOrder()
// and concrete method showDetails(). 3. Create interfaces: - PaymentMethod → pay(double amount)
// - DeliveryPartner → estimateDeliveryTime(int distance) - Rating → giveRating(int stars) 4.
// Implement classes: - ZomatoOrder (implements all interfaces) - SwiggyOrder (implements all
// interfaces) - LocalRestaurantOrder (implements only DeliveryPartner) 5. Use polymorphism and
// type casting in main(). 6. Demonstrate different behaviors for payment, delivery time, and rating.
// Goal: To understand abstraction, interfaces, polymorphism, and real-world system design 

// abstract class  Order  -> placeOrder()   ,showDetails();
// customerName ,amount
// interaface -> PaymentMethod ,Rating,DeliveryPartner 
// PaymentMethod -> abstract method-> pay(double amount)
// DeliveryPartner-> abstract method -> estimateDeliveryTime(int distance)
// Rating -> giveRating(int stars) 
// three child classes 
// ZomatoOrder 
// SwiggyOrder 
// LocalRestaurantOrder   
abstract class Order{  
   protected String customerName;
   protected double amount;
    Order(String customerName,double amount)
    {
        this.customerName=customerName;
        this.amount=amount;
    }
   abstract void placeOrder(); 
   
   void showDetails()
   {
       System.out.println("customerName name is " + customerName);
       System.out.println("amount is " + amount);
       
   }
}
interface PaymentMethod{
    void pay(double amount);
    
}
interface DeliveryPartner{
    void estimateDeliveryTime(int distance);
}
interface Rating{
    void giveRating(int stars);
}   

class Zomato extends Order implements PaymentMethod,DeliveryPartner,Rating
{  
    Zomato(String customerName,double amount)
    {
        super(customerName,amount);
        
    }
   public void pay(double amount)
    {
        System.out.println("amount is paid " + amount);
        
    }
   public void estimateDeliveryTime(int distance)
    {
        System.out.println("time taken" + (distance*5) + "minutes");
        
    }  
   public void placeOrder()
    {
        System.out.println("order is placed");
    }
   public void giveRating(int stars)
    {
        System.out.println("rating is " + stars);
    }
}
class Main{
    public static void main(String[]args)
    {
        Zomato z1=new Zomato("Niladree ",500);
         z1.estimateDeliveryTime(10);
         z1.pay(34.20);
         z1.placeOrder();
         z1.giveRating(4);
        
        
    }
}