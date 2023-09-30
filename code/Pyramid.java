import java.util.Scanner;

public class Pyramid{

    public static void main(String[] args){

Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number of rows here  - ");
int n=sc.nextInt();
int i,j;

for(i=1;i<=n;i++){
    for(j=1;j<=2*n-1;j++){

        if(j>=n-(i-1) && j<=n+(i-1)){

            System.out.print("@");
        }
        else{
            System.out.println(" ");
        }
    }
}


    }
}