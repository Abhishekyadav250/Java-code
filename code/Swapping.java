import java.util.Scanner;

public class Swapping{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the numbers here - ");

int x = sc.nextInt();
int y = sc.nextInt();

System.out.println("Before swapping"+ " "+x + " "+y);

int temp;
temp =x;
x=y;
y=temp;

System.out.println("After swapping"+ " "+x + " "+y);
}
}