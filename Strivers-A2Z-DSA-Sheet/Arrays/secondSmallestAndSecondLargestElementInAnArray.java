package StriverDSASheet;

import java.util.Scanner;

public class secondSmallestAndSecondLargestElementInAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();

        int fmin=Integer.MAX_VALUE,smin=Integer.MAX_VALUE;
        int fmax=Integer.MIN_VALUE,smax=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>fmax){
                smax=fmax;
                fmax=arr[i];
            }else if(arr[i]>smax){
                smax=arr[i];
            }

            if(arr[i]<fmin){
                smin=fmin;
                fmin=arr[i];
            }else if(arr[i]<smin){
                smin=arr[i];
            }
        }
        System.out.println(fmax+"  "+smax);
        System.out.println(fmin+"  "+smin);
    }
}
