import java.util.Scanner;

/**
 * Created by apple on 2017/9/9.
 */
/*
题目：取一个整数a从右端开始的4～7位。
 */
public class Number {
    public static void main(String[] args) {
        System.out.println("Please input a number longer than 7 digits.");
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        operation(a);
    }

    private static void operation(long a)
    {
        long i = a/1000;
        long j = a/10000000;
        long c = i-j*10000;
        System.out.println(c);
    }
}
