import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of words: ");
        int n = scan.nextInt();
        scan.nextLine(); 

        String name[] = new String[n];
int i,j=name.length();
        for (i = 0; i < n; i++) {
          
            name[i] = scan.nextLine();
        }
         int flag=0;
while(i<j){
if(name[i]!=name[j]){

flag=1;
break;


    j--;
    i++;
}


}

       

 if(flag==0){
            System.out.println("yes");
        }


        }
       
    }

