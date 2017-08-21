/**
 * Created by apple on 2017/8/21.
 */
/*
题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个
 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。
 到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。

程序分析：采取逆向思维的方法，从后往前推断。
 */
public class Monkey {
    public static void main(String[] args) {
        peach1();
        peach2();
    }

    private static void peach1()
    {
        int m = 1;
        for(int i = 1;i<11;i++)
        {
            m = m*2 + 2;
        }
        System.out.println("Peach1: " + m);
    }

    private static void peach2()
    {
        boolean b = false;
        int m = 1;
        while(b == false)
        {
            int n = m;
            for (int i=1;i<11;i++)
            {
                if(n%2!=0)
                {
                    n = 0;
                    break;
                }
                else
                {
                    n = n / 2 - 1;
                }
            }
            if(n == 1)
            {
                b = true;
            }
            else
            {
                m++;
            }
        }
        System.out.println("Peach2: " + m);
    }
}
