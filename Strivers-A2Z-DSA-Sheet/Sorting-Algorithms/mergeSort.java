package StriverDSASheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {
    public static  void m(int[] arr,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        ArrayList<Integer> list=new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        while(right<=high){
            list.add(arr[right]);
            right++;
        }
        System.out.println(list);
        for(int i=low;i<=high;i++){
            arr[i]=list.get(i-low);
        }
    }
    public static void ms(int []arr,int low,int high){

        if(low>=high){
            return;
        }

        int mid=(low+high)/2;
        ms(arr,low,mid);
        ms(arr,mid+1,high);
        m(arr,low,mid,high);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        ms(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}

//TC -- O(NlogN)
//SC -- O(NlogN)