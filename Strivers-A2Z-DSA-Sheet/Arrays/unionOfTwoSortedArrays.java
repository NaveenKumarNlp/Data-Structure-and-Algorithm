package StriverDSASheet;

import java.util.ArrayList;
import java.util.Scanner;

public class unionOfTwoSortedArrays {
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
            if(arr1[i]<=arr2[j]){
                if(list.size()==0 ||list.size()>0 && list.get(list.size()-1)!=arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            }else if(arr2[j]<arr1[i]){
                if(list.size()==0 || list.size()>0 && list.get(list.size()-1)!=arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n1){
            if(list.size()==0 ||list.size()>0 && list.get(list.size()-1)!=arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }
        while(j<n2){
            if(list.size()==0 || list.size()>0 && list.get(list.size()-1)!=arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }
        System.out.println(list);
    }
}
//Time Complexity: O(m+n), Because at max i runs for n times and j runs for m times. When there are no common elements in arr1 and arr2 and all elements in arr1, arr2 are distinct. 

//Space Complexity : O(m+n) {If Space of Union ArrayList is considered} O(1) {If Space of union ArrayList is not considered}