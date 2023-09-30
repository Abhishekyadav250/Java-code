import  java.util.*;
import java.util.Scanner;

public class ConcateString{

    public static void main(String[] ar){

       Scanner sc = new Scanner(System.in);
 
       System.out.print("Enter the first string here   -    ");

       String s1 = sc.nextLine();


   System.out.print("Enter the second string here   -    ");

       String s2 = sc.nextLine();


       String s3 =s1.concat(s2);

    System.out.println(s3);



    }
}