import java.util.Scanner;

public class SearchingElement{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.print("Enter the number of eleemt you want");

int n=scan.nextInt();

int arr[] = new int[n];
int i;

for(i=0;i<n;i++){

arr[i] = scan.nextInt();
}
System.out.print("Enter the element here which you want to find  ");
int key = scan.nextInt();

for(i=0;i<n;i++){

if(arr[i]==key){

System.out.println(key+" is at index number "+i);
}
}


}
}