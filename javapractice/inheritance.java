package javapractice;
// Inheritance -> 
// grandparent -> parent -> child
// face, color, height, weight -> grandparent
// parent  is class
// methods and fields


// import java.util.*;

// class inheritance {
//     int salary = 100000;
// }
// class programmer extends inheritance{
//     int bonus = 10000;
// }
// class Main{
//     public static void main(String[]args){
//         programmer p1 = new programmer();
//         System.out.println("Programmer salary: "+ p1.salary);
//         System.out.println("Programmer bonus: "+ p1.bonus);
//     }
// }


// class Animal{
//     void eat()
//     {
//         System.out.println("Eating....");
//     }
// }
// class DogeshBhai extends Animal{
//     String breed = "local";
//     void barking(){
//         System.out.println("barking.....");
//     }
// }
// class Main{
//     public static void main(String[]args){
//         DogeshBhai d1 = new DogeshBhai();
//         d1.eat();
//         d1.barking();
//         System.out.println(d1.breed);
//     }
// }

//Banking System(Single Inheritance):
//create a class account with variables account number and balance. Create a subclass savingsAccount that adds inheritance
// class Account{
//     int accountNumber = 832342345;
//     int balance = 100000000;
// }
// class SavingsAccount extends Account{
    
//         int interestRate = 2;
// }
// class Main{
//     public static void main(String[]args){
//         SavingsAccount d1 = new SavingsAccount();
//         System.out.println(d1.accountNumber);
//         System.out.println(d1.balance);
//         System.out.println(d1.interestRate);

//     }
// }

//Banking System(single Inheritance)
//create a class Account with variables accountNumber and balance are variables and 
//withdraw() , deposit() , display() are methods in parent class
//create a subclass SavingsAccount that adds interestRate is  variable and display()
//is method print interestRate
//user super() to initialize the variables of parent class 


import java.util.*;
class Account {
    int accountNumber;
    double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;


    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);  
        this.interestRate = interestRate;
    }

    
    void display() {
        super.display();  
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
class main {
    public static void main(String[] args) {
        SavingsAccount obj = new SavingsAccount(101, 5000, 5.5);

        obj.deposit(1000);
        obj.withdraw(2000);
        obj.display();
    }
}