package StriverDSASheet;

import java.util.Arrays;
import java.util.Scanner;

public class moveZeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();

        int zero=0,num=0;
        while(num<n){
            if(arr[num]==0){
                zero++;
            }else{
                int temp=arr[num];
                arr[num]=arr[num-zero];
                arr[num-zero]=temp;
            }
            num++;
        }
        System.out.println(Arrays.toString(arr));
    }
}

//TC --> O(N)
//SC --> O(1)