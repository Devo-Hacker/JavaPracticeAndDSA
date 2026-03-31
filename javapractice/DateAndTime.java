package javapractice;

//we already math utility
//string utility
//date and time 
//for date Date -> class in util package ->java.util.Date

// import java.util.Date;
// import java.time.LocalTime;
// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.ZoneId;
// import java.time.ZonedDateTime;

// class Main{
//     public static void main(String[]args){
//         Date date = new Date();
//         System.out.println("current date "+date);
//         System.out.println("current date is "+LocalDate.now());
//         System.out.println("current date is "+LocalTime.now());
//         System.out.println("current date is "+LocalDateTime.now());
//         ZoneId id = ZoneId.of("Asia/Kolkata");
//         ZonedDateTime Ist = ZonedDateTime.now(id);
//         System.out.println("Ist time "+Ist);
//     }
// }

//DateTimeFormatter
// date- dd-mm-yyyy

// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;
// class Main{
//     public static void main(String[]args){
//         LocalDate date= LocalDate.now();
//         DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//         System.out.println("date is "+date.format(f));
//         DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
//         System.out.println("date is "+date.format(f1));
//         DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM-yyyy-dd");
//         System.out.println("date is "+date.format(f2));
//     }
// }

// import java.time.LocalTime;
// import java.time.format.DateTimeFormatter;
// class Main{
//     public static void main(String[]args){
//         LocalTime time = LocalTime.now();
//         DateTimeFormatter f1 = DateTimeFormatter.ofPattern("HH:mm:ss");
//         System.out.println("current time is "+time.format(f1));
//     }
// }

//time formatter for date and time togather
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
// class Main{
//     public static void main(String[]args){
//         LocalDateTime datetime = LocalDateTime.now();
//         DateTimeFormatter f1 = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
//         System.out.println("current date and time is "+datetime.format(f1));
//         DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss ");
//         System.out.println("current date and time is "+datetime.format(f2));
//          DateTimeFormatter f3 = DateTimeFormatter.ofPattern("MM-dd-yyyy mm:HH:ss ");
//         System.out.println("current date and time is "+datetime.format(f3));
        
//     }
// }

//calender
import java.util.Calendar;

class Main
{
    public static void main(String[]args){
        Calendar c= Calendar.getInstance();
        System.out.println("current time "+ c.getTime());
        System.out.println("current year "+ c.get(Calendar.YEAR));
        System.out.println("current Month "+ (c.get(Calendar.MONTH)+1));
        
        
    }
}
