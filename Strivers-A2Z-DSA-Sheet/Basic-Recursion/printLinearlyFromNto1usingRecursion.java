package StriverDSASheet;

public class printLinearlyFromNto1usingRecursion {
    public static void main(String[] args) {
        RecFun(5,5);
    }

    private static void RecFun(int i, int n) {
        if(i<1){
            return;
        }
        System.out.print(i+" ");
        RecFun(i-1,n);
    }
}
