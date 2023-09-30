import java.util.Scanner;
public class FindLargestNumber{

public static void main(String arr[]){

Scanner scan = new Scanner(System.in);

System.out.println("Enter the first number here  ");

float a = scan.nextFloat();
System.out.println("Enter the second number here  ");
int b = scan.nextInt();
System.out.println("Enter the third number here  ");
int c = scan.nextInt();


if(a>b && b>c){

System.out.println(a+" is the greater number among these value");

}
else if(b>a && a>c){
System.out.println(b +" is the greater number among these value. " );
}
else if(c>a &&c>b){
System.out.println(c +" is the greater number among these value. " );
}

}
}