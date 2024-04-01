package StriverDSASheet;

import java.util.HashMap;
import java.util.Scanner;

public class frequencyOfArrayElement {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println(map);
        sc.close();
    }
}
