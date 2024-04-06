package StriverDSASheet;

import java.util.Scanner;

public class removeDuplicatesInPlaceFromSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        for (int j = 0; j < i+1; j++) {
            System.out.print(arr[j]+" ");
        }
    }
}
