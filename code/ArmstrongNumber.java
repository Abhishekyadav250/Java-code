import java.util.Scanner;

public class ArmstrongNumber{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter any number here to check Armstrong number ");
int x =scan.nextInt();
int y =scan.nextInt();
int i;

int rem,res=0,cube;

for(i=x;i>=y;i++){
int n=i;
while(n>0){

rem = n%10;
cube = rem*rem*rem;
res = res+cube;

n = n/10;

}
if(res==i){
System.out.println(i+"is Armstrong number");
}
else{
System.out.println(x+"is not Armstrong number");

}
}

}
}