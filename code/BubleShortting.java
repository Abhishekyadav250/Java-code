import java.util.Scanner;


public class BubleShortting {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of elemt you want   ");

        int n = sc.nextInt();


        int arr[] = new int[n];
        int i, flag = 0;

        for (i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

for(i=0;i<n;i++){

for(int j=0;j<n-1;j++){

if(arr[j]>arr[j+1]){

int temp = arr[j];
arr[j]=arr[j+1];

arr[j+1]=temp;

 flag =1;
}
}
if(flag==0){
break;
}
}

 for (i = 0; i < n; i++) {

         System.out.print(arr[i]+"        ");

        }
    }
}