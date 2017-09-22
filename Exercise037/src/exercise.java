/**
 * Created by apple on 2017/9/22.
 */
/*
题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
 */
public class exercise {
    public static void main(String[] args) {
        int a= weedOut(100);
        System.out.println(a);
    }

    private static int weedOut(int n)
    {
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = i+1;
        }

        int x = 0;
        int y = 0;
        int z = 0;

        while(z<n-1)
        {
            if (a[x] != 0)
            {
                y++;
            }
            if (y==3)
            {
                a[x] = 0;
                y=0;
                z++;
            }
            x++;
            if(x==n)
            {
                x = x-n;
            }
        }

        int b = 0;

        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                b = i+1;
            }
        }
        return b;
    }
}
