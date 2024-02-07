import java.io.*;
import java.util.*;
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
    public static void pattern11(int n){
        int star=1;
        for(int i=0;i<n;i++){
            star=(i%2==0)?1:0;
            for(int j=0;j<=i;j++){
                System.out.print(star);
                star=1-star;
            }
            System.out.println();
        }
    }
    public static void pattern12(int n){
        int star=2*n-2;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            for(int j=0;j<star;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(i-j+1);
            }
            star-=2;
            System.out.println();
        }
    }
    public static void pattern13(int n){
        int star=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(star+" ");
                star=star+1;
            }
            System.out.println();
        }
    }
    public static void pattern14(int n){
        for(int i=0;i<n;i++){
            char star='A';
            for(int j=0;j<=i;j++){
                System.out.print(star);
                star++;
            }
            System.out.println();
        }
    }
    public static void pattern15(int n){
        for(int i=0;i<n;i++){
            char star='A';
            for(int j=0;j<n-i;j++){
                System.out.print(star);
                star++;
            }
            System.out.println();
        }
    }
    public static void pattern16(int n){
        char star='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(star);
            }
            star++;
            System.out.println();
        }
    }
    public static void pattern17(int n){
        int star=2*n-2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char c1='A';
            for(int j=0;j<=i;j++){
                System.out.print(c1++);
            }
            c1--;
            c1--;
            for(int j=0;j<i;j++){
                System.out.print(c1--);
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern18(int n){
        
        for(int i=0;i<n;i++){
            char star=(char)(65+n-i-1);
            for(int j=0;j<=i;j++){
                System.out.print(star++);
            }
            System.out.println();
        }
    }
    public static void pattern19(int n){
        int star=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<star;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            star+=2;
            System.out.println();
        }
        star=2*n-2;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<star;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            star-=2;
            System.out.println();
        }
    }
    public static void pattern20(int n){
        int star=2*n-2;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<star;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            star-=2;
            System.out.println();
        }
        star=2;
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<star;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            star+=2;
            System.out.println();
        }
    }
    public static void pattern21(int n){
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                   System.out.print("* "); 
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }public static void pattern22(int n){
        
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                System.out.print(n-Math.min(Math.min(i,j),Math.min(2*n-i-2,2*n-j-2))+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
	    pattern1(5);
	    System.out.println();
	    pattern2(5);
	    System.out.println();
	    pattern3(5);
	    System.out.println();
	    pattern4(5);
	    System.out.println();
	    pattern5(5);
	    System.out.println();
	    pattern6(5);
	    System.out.println();
	    pattern7(5);
	    System.out.println();
	    pattern8(5);
	    System.out.println();
	    pattern9(5);
	    System.out.println();
	    pattern10(5);
	    System.out.println();
	    pattern11(5);
	    System.out.println();
	    pattern12(5);
	    System.out.println();
	    pattern13(5);
	    System.out.println();
	    pattern14(5);
	    System.out.println();
	    pattern15(5);
	    System.out.println();
	    pattern16(5);
	    System.out.println();
	    pattern17(5);
	    System.out.println();
	    pattern18(5);
	    System.out.println();
	    pattern19(5);
	    System.out.println();
	    pattern20(5);
	    System.out.println();
	    pattern21(5);
	    System.out.println();
	    pattern22(5);
      }
}
