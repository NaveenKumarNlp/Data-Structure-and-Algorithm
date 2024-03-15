package StriverDSASheet;

public class printLinearlyFrom1toNusingRecursionAndBacktracking {
    public static void main(String[] args) {
        RecFun(5,5);
    }

    private static void RecFun(int i, int n) {
        if(i<1){
            return;
        }
        RecFun(i-1,n);
        System.out.print(i+" ");
    }
}
