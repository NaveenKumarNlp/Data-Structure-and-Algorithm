package StriverDSASheet;

import java.util.Scanner;

public class maximumSubarraySumInAnArray {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE ARRAY SIZE");
        int n=sc.nextInt();
        System.out.println("ENTER THE ARRAY ELEMENTS");
        int []nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();

        //Kadane's Algorithm
        int max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println("Maximum Subarray Sum is  ->  "+max);
    }
}
//TC --> O(N);
//SC --> O(1);
