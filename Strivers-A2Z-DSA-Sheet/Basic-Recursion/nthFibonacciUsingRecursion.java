package StriverDSASheet;

public class nthFibonacciUsingRecursion {

    public static void main(String[] args) {
        int n=5;
        System.out.println(fib(n-1));
    }
    private static int fib(int n) {
        if(n<=1){
            return n;
        }
        int first=fib(n-1);
        int last=fib(n-2);
        return first+last;
    }
}

//TC -- O(2^N);
//SC -- O(2^N);
