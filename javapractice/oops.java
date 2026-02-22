package javapractice;
import java.util.*;
class Car{
    String model = "ford";
    String type = "sportz";

    void start(){
        System.out.println("you start the car");
    }

    void stop(){
        System.out.println("you stopped the car");
    }
}

public class oops {
    public static void main(String[] args){
        Car car = new Car();
        System.out.println(car.model);
        car.start();
    }
}
