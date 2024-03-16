package StriverDSASheet;

public class fibonacciSeriesuptoNusingRecursion {
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<=n;i++)
        System.out.print(RecFun(i)+" ");
    }

    private static int RecFun(int n) {
        if(n<=1){
            return n;
        }
        return RecFun(n-1)+RecFun(n-2); 
    }
}
