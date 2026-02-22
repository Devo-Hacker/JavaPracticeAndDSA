package javapractice;
import java.util.*;
public class string {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("arun");
        System.out.println(sb);
        sb.append("kumar");
            System.out.println(sb);
            sb.insert(4,"singh");
            System.out.println(sb);

    //delete
    sb.delete(2,5);
    System.out.println(sb);

    sb.reverse();
    System.out.println(sb);
    sb.replace(2,4,"ab");
    System.out.println(sb);

    //change to normal immutable string 
    String normalstring  = sb.toString();
    System.out.println(normalstring);
    System.out.println(sb.charAt(2));
    }
}
