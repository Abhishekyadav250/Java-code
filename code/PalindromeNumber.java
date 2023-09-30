import java.util.Scanner;

public class PalindromeNumber{
public static void main(String[] argms){


Scanner scan = new Scanner(System.in);

System.out.println("Enter any number here");

int x = scan.nextInt();
int rem,n,rev=0;

n=x;

while(n>0){

rem = n%10;
rev = rev*10+rem;

n = n/10;

}
if(rev ==x){
System.out.println(x+" is palindrome");
}
else{
System.out.println(x + " is not palindrome");
}



}
}