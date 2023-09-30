import java.util.Scanner;

public class DeleteElementFromArray{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

 String str = sc.nextLine();
 String rev="";

 char[] arr = str.toCharArray();

 System.out.println(arr);

 for(int i=arr.length-1;i>=0;i--){

    rev = rev+arr[i];
 }
System.out.println(rev);
}
}