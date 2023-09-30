import java.util.Scanner;

public class SecondLargestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elemt you want   ");

        int n = sc.nextInt();

        int arr[] = new int[n];
        int temps[]= new int[n];
        int i, j, max = 0;
    

        for (i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        for (i = 0; i < n; i++) {
            int   l = i + 1;
            for (j = l; j < n; j++) {

                if (arr[i] < arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                     arr[j] = temp;
                }


                if  (arr[i]!= arr[j]){
                    temps[j]=arr[i];
                }
              j++;
            }

             
            for (i = 0; i < n; i++) {

                System.out.print(temps[j] + "   ");

            }

        }
    }
}


