package StriverDSASheet;

import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE ARRAY SIZE");
        int n=sc.nextInt();
        System.out.println("ENTER THE ARRAY ELEMENTS");
        int []nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("ENTER THE TARGET VALUE");
        int target=sc.nextInt();
        //TYPE 1 --> IF SUM OF TWO ELEMENTS ARE TARGET MEANS RETURN THEIR INDEXS

        //TC --> O(N)
        //SC --> O(N)

        /*Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                System.out.println(result[0]+" "+result[1]);
                break;
            }
            map.put(nums[i],i);
        }*/


        //TYPE 2 -->  IF SUM OF TWO ELEMENTS ARE TARGET OR NOT RETURN YES OR NO;

        //TC --> O(NLOGN)
        //SC --> O(1);

        Arrays.sort(nums);
        int left=0,right=n-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                System.out.println("Yes");
                break;
            }
            if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        System.out.println("No");

        sc.close();
    }
}
