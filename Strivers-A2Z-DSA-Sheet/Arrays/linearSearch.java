package StriverDSASheet;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        sc.close();
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                index=i;
                break;
            }
        }
        System.out.println(num+" present at --> "+index);

    }
}
// TC ---> O(N)
// SC ---> 0(1);