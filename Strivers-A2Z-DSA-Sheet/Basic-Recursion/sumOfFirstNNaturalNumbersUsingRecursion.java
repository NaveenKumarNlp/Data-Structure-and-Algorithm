package StriverDSASheet;

public class sumOfFirstNNaturalNumbersUsingRecursion {
    public static void main(String[] args) {
       System.out.println(sum(5));
    }

    private static int sum(int i) {
        if(i<1){
            return 0;
        }
        return i+sum(i-1);
    }
}
