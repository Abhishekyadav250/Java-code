import java.util.Scanner;

public class ParameterOfRectangle{

public static void main(String[] agvs){

Scanner sc = new Scanner(System.in);
System.out.print("Enter the lenght here -  ");
int l = sc.nextInt();
System.out.print("Enter the width here -  ");
int b = sc.nextInt();
int para;

para = (l+b)*2;

System.out.println("Parameter of rectangle is "+para);
}
}