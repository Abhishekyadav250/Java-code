import java.util.Scanner;

public class MissingNumber{

public static void missing(int arr[], int n){

int expected_lenght= n+1;

int total_sum = (expected_lenght*(expected_lenght+1))/2;
int sum = 0;
int i;
for(i=0;i<n;i++){
sum=sum+arr[i];
}
int miss = total_sum-sum;

System.out.println(miss);

}

public static void main(String[] arrgs){

int arr[] = {1,2,3,4,6,7,8,9,10};

int n = arr.length;
missing(arr,n);


}
}