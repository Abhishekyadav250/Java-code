import java.util.Scanner;

public class FirstRepeatedValue{


public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.print("Enter the number of eleemt you want");

int n=scan.nextInt();

int arr[] = new int[n];
int i,j;

for(i=0;i<n;i++){

arr[i] = scan.nextInt();
}

for(i=0;i<n;i++){
for(j=i+1;j<n;j++){

if(arr[i]==arr[j]){

System.out.println(arr[i]);

break;
}

}

}
}
}