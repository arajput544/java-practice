package Pkg;

public class mod {

    public static void main(String[] args) {
        int p = 1;
        int q = 60;
        int mod = 1000000007;

        // Calculate p*q^-1 mod 1000000007
        int result = (int) (((long) p * pow(q, -1)) % mod);

        System.out.println("p*q^-1 mod 1000000007 = " + result);
    }

    private static long pow(int x, int y) {
        long result = 1;
        while (y > 0) {
            if ((y & 1) == 1) {
                result = (result * x) % 1000000007;
            }
            x = (x * x) % 1000000007;
            y >>= 1;
        }
        return result;
    }
}