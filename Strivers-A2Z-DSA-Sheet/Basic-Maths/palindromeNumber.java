package StriverDSASheet;

public class palindromeNumber {
    public static void main(String[] args) {
        int n=121,rev=0;
        int temp=n;
        while(n>0){
            rev=rev*10+(n%10);
            n/=10;
        }
        if(temp==rev){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not Palindrome Number");
        }
    }
}
