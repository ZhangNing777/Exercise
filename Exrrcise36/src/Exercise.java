/**
 * Created by apple on 2017/9/22.
 */
/*
题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
 */
public class Exercise {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9};
        change(a,4);
    }

    private static void change (int a[],int m)
    {
        int[] b = new int[a.length-m];
        int[] c = new int[m];
        for (int i=0;i<a.length;i++)
        {
            if(i<a.length-m)
            {
                b[i] = a[i];
            }
            if(i>=a.length-m)
            {
                c[i-a.length+m] = a[i];
            }
        }
        for (int i=0;i<a.length;i++)
        {
            if(i<m)
            {
                a[i] = c[i];
            }
            if(i>=m)
            {
                a[i] = b[i-m];
            }
        }
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
