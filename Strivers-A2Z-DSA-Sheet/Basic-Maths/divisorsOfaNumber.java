package StriverDSASheet;

public class divisorsOfaNumber {
    public static void main(String[] args) {
        int n=36;
        for(int i=1;i<=(n+1)/2;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println(n);

        System.out.println("The divisors of "+n+" are:");
		for(int i = 1; i <= (int)Math.sqrt(n); i++){
			if(n % i == 0){
				System.out.print(i + " ");
				if(i != n/i) System.out.print(n/i + " ");
			}
        }
    }
}
