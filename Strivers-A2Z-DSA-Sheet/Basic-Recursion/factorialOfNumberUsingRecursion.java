package StriverDSASheet;

public class factorialOfNumberUsingRecursion {
    public static void main(String[] args) {
        int num=5;
        System.out.println(RecFun(num));
    }

    private static int RecFun(int num) {
        if(num==1){
            return 1;
        }
        return num*RecFun(num-1);
    }
}
