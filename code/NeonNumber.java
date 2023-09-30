import java.util.Scanner;

public class NeonNumber{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.print("Enter any number here  -  ");

int n = scan.nextInt();
int sqr,rem,sum=0,x;

sqr= n*n;
x=sqr;
while(x>0){

rem = x%10;
sum = sum+rem;

x/=10;
}

if(sum==n){

System.out.println(n+" is neon number");
}
else{
System.out.println(n+" is not neon number");

}
}

}