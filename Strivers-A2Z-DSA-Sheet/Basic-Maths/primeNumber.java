package StriverDSASheet;

public class primeNumber {
    public static void main(String[] args) {
        int n=36;
        int count=0;
        System.out.println(Math.sqrt(n));
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count=+2;
            }
        }
        if(count==2){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }
    }
}
