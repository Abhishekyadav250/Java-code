import java.util.Scanner;

public class Factorial{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.print("Enter any number here  -  ");

int n = scan.nextInt();

int i,fact=1;

for(i=1;i<=n;i++)
{
fact = fact*i;

}
System.out.print("The factorial of"+" "+n+" is"+" =  "+fact);
}

}