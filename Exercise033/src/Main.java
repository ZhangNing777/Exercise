/**
 * Created by apple on 2017/9/17.
 */
/*
题目：打印出杨辉三角形

程序分析：

       1

      1 1

     1 2 1

    1 3 3 1

   1 4 6 4 1

 1 5 10 10 5 1

 */
public class Main {
    public static void main(String[] args) {
        printNumber(20);
    }

    private static void printNumber(int x) {
        int[][] a = new int[x][2*x+1];

        a[0][x] = 1;

        for (int i=1;i<x;i++)
        {
            for (int j=x-i;j<x+i+1;j++)
            {
                a[i][j] = a[i-1][j-1]+a[i-1][j+1];
            }
        }
        for (int i=0;i<x;i++)
        {

            for (int j=0;j<x*2+1;j++)
            {
                if (a[i][j] == 0)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(a[i][j]);
                }
            }
            System.out.println();
        }
    }
}
