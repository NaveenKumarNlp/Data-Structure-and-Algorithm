package StriverDSASheet;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < n-1; i++) {
            int mini=i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mini];
            arr[mini]=temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
//TC -- O(N*N)
//SC -- O(1);