import java.util.Scanner;

public class StringArray {
    public static void  main(String[] arg){
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int i;
String name[]= new String[n];
for(i=0;i<n;i++){
    name[i]=sc.nextLine();
}
for( i=0;i<n;i++){
System.out.print(name[i]+ name[i].length()+" ~ ");
}


    }
}
