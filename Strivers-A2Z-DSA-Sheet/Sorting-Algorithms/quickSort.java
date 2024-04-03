package StriverDSASheet;

import java.util.Arrays;
import java.util.Scanner;

public class quickSort {

    public static int position(int []arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<high){
                i++;
            }
            while(arr[j]>pivot && j>low){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
        }
        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;
        return j;
    }

    public static void qs(int []arr,int low,int high){
        if(low<high){
            int pivot=position(arr,low,high);
            qs(arr,low,pivot-1);
            qs(arr,pivot+1,high);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        qs(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}

//TC -- O(NlogN)
//SC -- O(1)