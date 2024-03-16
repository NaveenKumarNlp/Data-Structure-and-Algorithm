package StriverDSASheet;

public class palindromeUsingRecursion {
    public static void main(String[] args) {
        String str="naveeneevan";
        System.out.println(RecFun(str,0,str.length()-1));
    }

    private static boolean RecFun(String str, int start, int end) {
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return RecFun(str, start+1, end-1);
    }
}
