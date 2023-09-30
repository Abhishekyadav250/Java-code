import java.util.Scanner;

public class SumofElement{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.print("Enter the number of element here - ");

int n = scan.nextInt();

int arr[] = new int[n];
int i, sum=0;


System.out.println("Enter the element of array below  - ");

for(i=0;i<n;i++){

arr[i]=scan.nextInt();  
}
for(i=0;i<n;i++){

 sum = sum+arr[i];

}
System.out.println("The sum of the array element = "+sum);
}
}