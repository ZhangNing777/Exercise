import java.util.Scanner;

/**
 * Created by apple on 2017/9/17.
 */
/*
题目：输入3个数a,b,c，按大小顺序输出。

程序分析：利用指针方法。
 */
public class Number {
    public static void main(String[] args) {
        System.out.println("Please input three number; ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        arrange(a,b,c);
    }

    private static void arrange(int a,int b,int c)
    {
        if(a<b)
        {
            int t = a;
            a = b;
            b = t;
        }
        if(a<c)
        {
            int t = a;
            a = c;
            c = t;

        }
        if(b<c)
        {
            int t = b;
            b = c;
            c = t;
        }
        System.out.println(a+" "+b+" "+c);
    }
}
