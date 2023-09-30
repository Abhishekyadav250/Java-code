import java.util.Scanner;

public class ArraySwapping{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.print("Enter the number of eleemt you want    ");

int n=scan.nextInt();

int arr[] = new int[n];
int i;

for(i=0;i<n;i++){

arr[i] = scan.nextInt();
}


for(i=0;i<n;i++){

int temp = arr[0];

arr[0]= arr[n-1];

arr[n-1] = temp;

}
for(i=0;i<n;i++){

System.out.print(arr[i]+"        ");

}

}
}