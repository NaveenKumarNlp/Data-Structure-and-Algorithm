package StriverDSASheet;
import java.util.Scanner;
public class missingNumberInAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        int xor=n;
        for(int i=0;i<n-1;i++){
            xor=xor^(i+1);
            xor=xor^arr[i];
        }
        System.out.println("missing number is -->  "+xor);
    }
}
//TC ---> O(n)
//SC ---> O(1)