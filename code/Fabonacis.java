import java.util.Scanner;

public class Favonacis{

public static void main(String[] argm){

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

int i ,f=0,s=1,next,sum=0;
System.out.println(f);
for(i = 0; i<=n;i++){


next=f+s;

s=f;

f=next;

if(next%2==0){
sum = sum+next;

}

System.out.println(next);
}
System.out.print(sum);
}
}