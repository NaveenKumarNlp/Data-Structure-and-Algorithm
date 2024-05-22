package StriverDSASheet;

import java.util.Scanner;

public class maximumConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int max=0,count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
            }else{
                max=Math.max(count,max);
                count=0;
            }
        }
        System.out.println("Maximun Consecutive Ones is --> "+max);
        sc.close();
    }
}
