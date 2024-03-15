package StriverDSASheet;

public class printLinearlyFrom1toNusingRecursion {
    public static void main(String[] args) {
        RecFun(1,5);
    }

    public  static void RecFun(int i, int n) {
        if(i>n){
            return ;
        }
        System.out.print(i+" ");
        RecFun(i+1, n);
    }
}
