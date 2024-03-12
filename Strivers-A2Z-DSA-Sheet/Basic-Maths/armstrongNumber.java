package StriverDSASheet;

public class armstrongNumber {
    public static void main(String[] args) {
        int n=153;
        int temp=n;
        int digitCount=(int) Math.floor(Math.log10(n) + 1);
        int sum=0;
        while(n>0){
            sum+=Math.pow(n%10,digitCount);
            n/=10;
        }
        if(sum==temp){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
}
