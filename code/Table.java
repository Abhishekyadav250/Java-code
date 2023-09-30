5import java.util.Scanner;

public class Table{

public static void main(String[] arg){

//Scanner sc = new Scanner(Setting.in);
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number here - ");

int x = sc.nextInt();

int i,table;

for(i = 1; i<=10;i++){


table = x*i;
System.out.println(x + " * " + i + " = "+ table);
}





}
}