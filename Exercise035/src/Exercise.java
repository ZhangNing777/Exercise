/**
 * Created by apple on 2017/9/19.
 */
/*
题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 */
public class Exercise {
    public static void main(String[] args) {
        int a[] = new int[]{1,37,7,9,14,5,2,7,8,15,36,4,25};
        change(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    private static void change(int a[])
    {
        int x = 0;
        int y = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>a[x])
            {
                x = i;
            }
        }
        int temp1 = a[x];
        a[x] = a[0];
        a[0] = temp1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<a[y])
            {
                y = i;
            }
        }
        int temp2 = a[y];
        a[y] = a[a.length-1];
        a[a.length-1] = temp2;
    }
}
