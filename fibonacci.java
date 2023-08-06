public class fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
    public static void main(String[] args) {
        int n=5;
//        int[] f=new int[n];
        int a=fibonacci(n);
        System.out.println(a);
    }
}
