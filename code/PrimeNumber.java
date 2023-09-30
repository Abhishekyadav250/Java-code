import java.util.Scanner;

public class PrimeNumber{

static public void  main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter any number here to check wheather it is prime or not  -   ");

    int n = scan.nextInt();

    int i,flag=0;
    if(n==0 || n==1){
        flag=1;

    }
    for(i=2;i<=n/2;i++){

        if(n%i==0){

            flag =1;
            // break;
        }

    }
    if(flag==0){
        System.out.println(n+" is the prime number.");
    }
    else{
        System.out.println(n+" is not prime number");
    }
}

}