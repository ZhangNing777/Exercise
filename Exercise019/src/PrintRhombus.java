/**
 * Created by apple on 2017/8/21.
 */
/*
题目：打印出如下图案（菱形）

    *
   ***
  *****
 *******
  *****
   ***
    *
程序分析：先把图形分成两部分来看待，前四行一个规律，后三行一个规律，
利用双重 for循环，第一层控制行，第二层控制列。
*/
public class PrintRhombus {
    public static void main(String[] args) {
        print();
    }

    private static void print()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<8;j++)
            {
                if(j>4-i&&j<4+i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<8;j++)
            {
                if(j>i&&j<8-i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
