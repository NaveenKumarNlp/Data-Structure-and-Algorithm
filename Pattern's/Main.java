public class Main
{
    public static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }public static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        int star=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            star+=2;
            System.out.println();
        }
    }
    public static void pattern8(int n){
        int star=2*n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            star-=2;
            System.out.println();
        }
    }
    public static void pattern9(int n){
        int star=1,space=0;
        for(int i=0;i<2*n;i++){
            space=(n>i)?n-i-1:i-n;
            if(i==n){
                star=2*n-1;
            }
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            star=i<n?star+2:star-2;
            System.out.println();
        }
    }
    public static void pattern10(int n){
        int star=0;
        for(int i=0;i<2*n;i++){
            star=(i<n)?star+1:star-1;
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		pattern10(5);
	}
}
