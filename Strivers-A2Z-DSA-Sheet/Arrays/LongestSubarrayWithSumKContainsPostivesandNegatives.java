package StriverDSASheet;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayWithSumKContainsPostivesandNegatives {
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

        HashMap<Integer,Integer> map=new HashMap<>();

        int sum=0,maxLen=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            int rem=sum-k;
            if(sum==k){
                maxLen=Math.max(maxLen,i+1);
            }
            if(map.containsKey(rem)){
                maxLen=Math.max(maxLen,i-map.get(rem));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        System.out.println(maxLen);
        sc.close();
    }
}
//TC --> O(N)
//SC --> O(N)