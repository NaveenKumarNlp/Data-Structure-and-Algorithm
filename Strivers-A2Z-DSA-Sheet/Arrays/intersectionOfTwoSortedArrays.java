package StriverDSASheet;

import java.util.ArrayList;
import java.util.Scanner;

public class intersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n1=sc.nextInt();
        int []arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }

        int n2=sc.nextInt();
        int []arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        sc.close();

        ArrayList<Integer> list=new ArrayList<>();
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(arr1[i]==arr2[j]){
                list.add(arr1[i]);
                i++;
                j++;
            }else if(arr2[j]<arr1[i]){
                j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }
        }
        System.out.println(list);
    }
}
