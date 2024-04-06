package StriverDSASheet;

import java.util.Scanner;

public class leftRotateTheArrayByDPlace {
    public static void revrse(int []arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        sc.close();
        revrse(arr, 0, x-1);
        revrse(arr, x, n-1);
        revrse(arr, 0, n-1);
        

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
//TC -- O(N)
//SC -- O(1)