import java.util.Scanner;

public class Calculator{

public static void main(String[] argus){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the first number here - ");

int x = sc.nextInt();
System.out.println("Enter the Second number here - ");

int y = sc.nextInt();

System.out.println("Enter any symbol among these +,-,*,/ ");

String z = sc.next();
int res;

switch(z){

case "+": res = x+y;
System.out.println("The result is  "+res);
break;

case "-": res = x-y;
System.out.println("The result is  "+res);
break;

case "*": res = x*y;
System.out.println("The result is  "+res);
break;

case "/": res = x/y;
System.out.println("The result is  "+res);
break;

default:
System.out.println("Enter valid symbol");
break;
}


}
}