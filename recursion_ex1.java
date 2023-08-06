public class recursion_ex1 {
    public static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
        System.out.println("ahh");
        System.out.println(n);
    }

    public static void main(String[] args) {
        fun(3);
    }
}
// f(0) call hone pe return hoga f(1) me than next line will execute so 1,