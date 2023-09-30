import java.util.Scanner;

public class EvenOdd{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter any number here -  ");

int x = sc.nextInt();

if(x%2==0){
System.out.println(x+" is a even number.");
}
else{
System.out.println(x+" is a odd number");
}

}
}