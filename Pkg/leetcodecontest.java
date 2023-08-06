package Pkg;

public class leetcodecontest {
    public static String makeSmallestPalindrome(String s) {
        int count=0;

        StringBuilder str = new StringBuilder(s);
        int n = str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                int c = Character.compare(str.charAt(i),str.charAt(n-1-i));
                if(c>0){
                    str.setCharAt(i,str.charAt(n-1-i));
                }
                else if(c<0){
                    str.setCharAt(n-1-i,str.charAt(i));
                }
            }
        }
        return str.toString();

    }
    public static void main(String[] args) {
        String s = makeSmallestPalindrome("ekjh");
        System.out.println(s);



    }
}
