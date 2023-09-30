import java.util.Scanner;

public class Pattern{


public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the number of row here   -   ");

int n = sc.nextInt();

int i,j;

for(i=0;i<2*n;i++){
    for(j=0;j<n;j++){

        if(i>n){
          int col = 2*n-i-1;
            System.out.print(col);
        }
        else{
            int col = i; 
              System.out.print(" ");
        }
    }
       System.out.println(" ");
}








}

}