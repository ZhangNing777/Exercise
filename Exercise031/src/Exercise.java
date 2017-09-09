/**
 * Created by apple on 2017/9/9.
 */
/*
题目：将一个数组逆序输出。

程序分析：用第一个与最后一个交换。
 */
public class Exercise {
    public static void main(String[] args) {
        int a[] = new int[]{1,3,5,4,2,2,6,3,};
        reverseOrderPrint(a);
        for(int i = 0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    private static int[] reverseOrderPrint(int[] a)
    {
        for(int i=0;i<a.length/2;i++)
        {
            int temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = temp;
        }
        return a;
    }
}
