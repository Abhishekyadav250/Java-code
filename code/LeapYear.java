import java.util.Scanner;

public class LeapYear{


public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the year here - " );

int x= sc.nextInt();

if(x%4==0 || x%100==0){
System.out.println(x+" is a leap year");

}
else{
System.out.println(x +" is not leap year.");
}

}
}