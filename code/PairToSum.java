import java.util.Scanner;

public class PairToSum{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);


System.out.print("Enter the number of eleemt you want");

int n=scan.nextInt();

int arr[] = new int[n];
int i,j;

for(i=0;i<n;i++){

arr[i] = scan.nextInt();
}
System.out.print("Enter the value of the sum here  ");
int key = scan.nextInt();

for(i=0;i<n;i++){
for(j=0;j<n;j++){

if(arr[i]+arr[j]==key){


System.out.println(i+" "+arr[i]+" "+j+" "+arr[j]);

}

}
}




}
}