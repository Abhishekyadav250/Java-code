import java.util.Scanner;


public class MaxElement {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of elemt you want   ");

        int n = sc.nextInt();


        int arr[] = new int[n];
        int i, max = 0;

        for (i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        for (i = 0; i < n; i++) {

            if (arr[i] > max) {

                max = arr[i];
 
            }

        }
       System.out.println("Maximum element is =  "+max);
    }
}