package StriverDSASheet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestAndLowestFrequencyArrayElement {
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
        int minFre=Integer.MAX_VALUE,maxFre=Integer.MIN_VALUE,min=0,max=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()<minFre){
                minFre=entry.getValue();
                min=entry.getKey();
            }
            if(entry.getValue()>maxFre){
                maxFre=entry.getValue();
                max=entry.getKey();
            }
        }
        System.out.println(map);
        System.out.println(min+" = "+minFre+"     "+max+" = "+maxFre);
        sc.close();
    }
}
