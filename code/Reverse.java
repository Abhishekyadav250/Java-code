import java.util.Scanner;

public class Reverse{


public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.print("Enter the number of eleemt you want");

int n=scan.nextInt();

int arr[] = new int[n];
int i,j=arr.length-1;

for(i=0;i<n;i++){

arr[i] = scan.nextInt();
}

while(j>i){

int temp=arr[i];

arr[i]=arr[i+1];

arr[i+1] = temp;
j--;
i++;
}

for(i=0;i<n;i++){

System.out.println(arr[i]);
}


}
}
