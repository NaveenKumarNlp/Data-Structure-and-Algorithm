package StriverDSASheet;

import java.util.Arrays;

public class ReverseArrayUsingRecursion {
    private static void RecFun(int arr[],int start,int end){
        if(start>=end){
            return ;
        }
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        RecFun(arr, start+1, end-1);
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        RecFun(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }
}
