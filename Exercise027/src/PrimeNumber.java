import java.util.Scanner;

/**
 * Created by apple on 2017/8/24.
 */
/*
题目：求100之内的素数
 */
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Please input the range");
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        Scanner m = new Scanner(System.in);
        int b = m.nextInt();
        quality(a, b);
    }

    public static boolean prime(int n) {
        boolean b = true;
        if (n == 1)
            b = false;
        else {
            for (int i = 2; i < n; i++) {
                if ((n % i) == 0) {
                    b = false;
                    break;
                } else {
                    b = true;
                }
            }
        }
        return b;
    }

    public static int quality(int m, int n) {
        for (int i = m; i < n; i++) {
            if (prime(i)) {
                System.out.println(i + "; ");
            }
        }
        return 0;
    }
}
