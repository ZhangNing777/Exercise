import java.util.Scanner;

/**
 * Created by apple on 2017/9/7.
 */
/*
题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 */
public class InsectNumber {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,5,7,9,10,12,14,16,19,20};
        Scanner s = new Scanner(System.in);
        System.out.println("Please inout a number:");
        int b = s.nextInt();
        int c[] = instct(a,b);
        for(int i=0;i<a.length+1;i++)
        {
            System.out.print(c[i]+" ");
        }
    }

    private static int[] instct(int a[],int b)
    {
        int m = a.length;
        int c[] = new int[m+1];
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>b) {
                c[i] = b;
                for (int j = 0; j < i; j++) {
                    c[j] = a[j];
                }
                for (int k = i; k < a.length; k++) {
                    c[k + 1] = a[k];
                }
                break;
            }
        }
        return c;
    }
}
