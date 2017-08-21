/**
 * Created by apple on 2017/8/21.
 */
/*
题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。

程序分析：请抓住分子与分母的变化规律。
 */
public class Summation {
    public static void main(String[] args) {
        sum();
    }

    private static void sum()
    {
        int a = 1;
        int b = 1;
        double sum = 0;
        for(int i=0;i<20;i++)
        {
            int m = a;
            int n = b;
            a = m + n;
            b = m;
            double k = (double)a/b;
            sum = sum + k;
        }
        System.out.println(sum);
    }
}
