import java.util.Scanner;

/**
 * Created by apple on 2017/9/7.
 */
/*
题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 */
public class InsectNumber {
    public static void main(String[] args) {
        int a[];
        a = new int[6];
        a[0] = 1;
        a[1] = 3;
        a[2] = 5;
        a[3] = 7;
        a[4] = 9;
        Scanner s = new Scanner(System.in);
        System.out.println("Please inout a number:");
        int b = s.nextInt();
        insect2(a,b);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    private static int[] insect1(int a[],int b)
    {
        int m = a.length;
        int c[] = new int[m+1];
        for(int i=0;i<a.length-2;i++)
        {
            if(a[i]>b) {
                c[i] = b;
                for (int j = 0; j < i; j++) {
                    c[j] = a[j];
                }
                for (int k = i; k < a.length-1; k++) {
                    c[k + 1] = a[k];
                }
                break;
            }
        }
        return c;
    }

    private static int[] insect2(int a[],int b)
    {
        int m = a.length;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>b) {
                int temp;
                temp = a[i];
                a[i] = b;
                for (int j= a.length-1; j>i+1; j--) {
                    a[j] =a[j-1];
                }
                a[i+1] = temp;
                break;
            }
        }
        return a;
    }

}
