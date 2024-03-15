package StriverDSASheet;

public class printNameNtimesUsingRecursion {
    public static void RecFun(int i,int n){
        if(i>n){
            return ;
        }
        System.out.println("Naveen");
        RecFun(i+1, n);
    }
    public static void main(String[] args) {
        RecFun(1,5);
    }
}
