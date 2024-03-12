package StriverDSASheet;

public class gcdOfTwoNumbers {

    //Using Euclidean’s theorem.
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int a=123,b=12;
        System.out.println(a+" "+b+" = "+gcd(a,b));
    }
}
