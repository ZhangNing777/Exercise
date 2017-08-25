import java.util.Scanner;

/**
 * Created by apple on 2017/8/25.
 */
/*
题目：求一个3*3矩阵对角线元素之和

程序分析：利用双重for循环控制输入二维数组，再将a[i][i]累加后输出。
 */
public class Summation {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        Scanner s = new Scanner(System.in);
        System.out.println("Please input ten numbers");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                a[i][j] = s.nextInt();
                if(i==3&&j==3)
                {
                    break;
                }
            }
        }
        matrix(a);
    }

    private static void matrix(int a[][])
    {
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<a.length;i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                if (i==j)
                {
                    sum1 = sum1 + a[i][j];
                }
                if (i+j==2)
                {
                    sum2 = sum2 + a[i][j];
                }
            }
         }
         System.out.println("Sum1: "+sum1+"\nSum2: "+sum2);
    }
}
