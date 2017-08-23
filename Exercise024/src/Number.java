import java.util.Scanner;

/**
 * Created by apple on 2017/8/22.
 */
/*
题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 */
public class Number
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input a number");
        int n = s.nextInt();
        transform(n);
    }

    private static void transform(int n) {
        int[] a = new int[5];
        int i = 0;
        while (n != 0) {
            a[i] = n % 10;
            n = n / 10;
            i++;
        }
        System.out.println(i);
        for (int j = 0; j < i; j++) {
            System.out.print(a[j]);
        }
    }
}
