package StriverDSASheet;

import java.util.Scanner;

public class majorityElementThatOccursMoreThanHalfTimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE ARRAY SIZE");
        int n=sc.nextInt();
        System.out.println("ENTER THE ARRAY ELEMENTS");
        int []nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        //Moore’s Voting Algorithm:
        int ele=0,cnt=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                ele=nums[i];
                cnt=1;
            }else if(nums[i]==ele){
                cnt++;
            }else{
                cnt--;
            }
        }
        System.out.println("majority elements is --> "+ele);
        sc.close();
        //IF MAJORITY ELEMENTS MAY NOT EXISTS MEANS  WE NEED DO CHECK WHETHER ELEMENTS IS MORE THAN N/2 
        //FOR THAT
        /*for(int i=0;i<n;i++){
            if(ele==nums[i]){
                count++;
            }
        } 
        if(count>(n/2)){
            return ele;
        }
        return -1;
        */
    }
}
//TC --> O(N)
//SC --> O(1);