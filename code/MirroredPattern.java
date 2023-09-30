import java.util.Scanner;

public class MirroredPattern{


public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the number of row here   -   ");

int n = sc.nextInt();

int i,j;

for(i=0;i<n;i++){
    for(j=0;j<n;j++){

        if(i+j>=6){
            System.out.print("*");
        }
        else{
             System.out.print(" "); 
        }
    }
       System.out.println(" ");
}








}

}