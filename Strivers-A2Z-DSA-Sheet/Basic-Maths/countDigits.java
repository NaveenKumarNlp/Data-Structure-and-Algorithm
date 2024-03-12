package StriverDSASheet;

public class countDigits {
    public static void main(String[] args) {
        int n=1234;
        int digits=0;
        while(n>0){
            n/=10;
            digits++;
        }
        //int digits = (int) Math.floor(Math.log10(n) + 1);

        //String n2 = Integer.toString(n);
        //return n2.length();

        System.out.println(digits);
    }
}
