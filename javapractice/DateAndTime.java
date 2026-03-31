package javapractice;

//we already math utility
//string utility
//date and time 
//for date Date -> class in util package ->java.util.Date
import java.util.Date;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

class Main{
    public static void main(String[]args){
        Date date = new Date();
        System.out.println("current date "+date);
        System.out.println("current date is "+LocalDate.now());
        System.out.println("current date is "+LocalTime.now());
        System.out.println("current date is "+LocalDateTime.now());
        
    }
}