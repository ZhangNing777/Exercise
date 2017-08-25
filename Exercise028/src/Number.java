import java.util.Scanner;

/**
 * Created by apple on 2017/8/25.
 */
/*
题目：对10个数进行排序
程序分析：可以利用选择法，即从后9个比较过程中，选择一个最小的与第一个元素交换，
下次类推，即用第二个元素与后8个进行比较，并进行交换。
 */
public class Number {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Please input ten numbers");
        for (int i=0;i<10;i++)
        {
            a[i] = s.nextInt();
            if(i==10)
            {
                break;
            }
        }
        arrange(a);
    }

    private static void arrange(int a[])
    {
        for(int i=0;i<10;i++)
        {
            for (int j=0;j<(9-i);j++)
            {
                if (a[j]>a[j+1])
                {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        for (int i=0;i<10;i++)
            System.out.print(a[i]+" ");
    }
}
