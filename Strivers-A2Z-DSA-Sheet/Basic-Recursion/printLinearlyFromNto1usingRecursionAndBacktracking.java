package StriverDSASheet;

public class printLinearlyFromNto1usingRecursionAndBacktracking {
    public static void main(String[] args) {
        RecFun(1,5);
    }

    private static void RecFun(int i, int n) {
        if(i>n){
            return ;
        }
        RecFun(i+1,n);
        System.out.print(i+" ");
    }
}
