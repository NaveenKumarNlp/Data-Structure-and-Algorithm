package StriverDSASheet;
import java.util.Scanner;
public class longestSubarrayWithGivenSumKContainsPositives {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array Length");
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the k");
        int k=sc.nextInt();

        int left=0,right=0,sum=0,maxLen=0;
        while(right<n){
            sum+=arr[right];
            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxLen=Math.max(maxLen,right-left+1);
            }
            right++;
        }
        System.out.println(maxLen);
        sc.close();
    }
}
//TC --> O(N)
//SC --> O(1)