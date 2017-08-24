import java.util.Scanner;

/**
 * Created by apple on 2017/8/24.
 */
/*
题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 */
public class Number
{
    public static void main(String[] args) {
        System.out.println("Please input a five-digit number");
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        palindromicNumber(m);
    }

    private static void palindromicNumber(int m)
    {
        int[] a = new int[5];
        for (int i=0;i<5;i++)
        {
            a[i] = m%10;
            m = m/10;
        }
        if(a[0]==a[4] && a[1]==a[3])
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
