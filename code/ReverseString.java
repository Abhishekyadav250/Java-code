import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of words: ");
        int n = scan.nextInt();
        scan.nextLine(); 

        String name[] = new String[n];

        for (int i = 0; i < n; i++) {
          
            name[i] = scan.nextLine();
        }

       
        for (int i = 0; i < n / 2; i++) {
            String temp = name[i];
            name[i] = name[n - i - 1];
            name[n - i - 1] = temp;
        }

        System.out.println("Reversed words:");
        for (int i = 0; i < n; i++) {
            System.out.println(name[i]);
        }
    }
}
