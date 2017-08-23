/**
 * Created by apple on 2017/8/22.
 */
/*
题目：求1+2!+3!+...+20!的和

程序分析：此程序只是把累加变成了累乘。
 */
public class Summation {
    public static void main(String[] args) {
        long sum = summation(20);
        System.out.println("Sum: "+sum);
    }

    private static long factorial(int n)
    {
        long a=1;
        for (int i=1;i<=n;i++)
        {
            a = a*i;
        }
        return a;
    }

    private static long summation(int n)
    {
        long sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum = sum+factorial(i);
        }
        return sum;
    }
}
