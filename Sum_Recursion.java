public class Sum_Recursion {
    public static int sum(int a){
        if (a==0){
            return 0;
        }

        return sum(a/10)+(a%10);
    }
    public static void main(String[] args){
        int a=33;
        int b=sum(a);
        System.out.println(b);

    }

}
