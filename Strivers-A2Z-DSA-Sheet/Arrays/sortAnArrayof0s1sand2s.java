package StriverDSASheet;

import java.util.Arrays;
import java.util.Scanner;

public class sortAnArrayof0s1sand2s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE ARRAY SIZE");
        int n=sc.nextInt();
        System.out.println("ENTER THE ARRAY ELEMENTS");
        int []nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(nums));

        sc.close();
    }
}
//TC --> O(N)
//SC --> O(1)