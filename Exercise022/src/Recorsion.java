/**
 * Created by apple on 2017/8/22.
 */
/*
题目：利用递归方法求5!。

程序分析：递归公式：fn=fn_1*4!
 */
public class Recorsion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n+"!="+formula(n));
    }

    private static int formula(int a )
    {
        if(a==1)
        {
            return 1;
        }
        else
        {
            return formula(a-1)*a;
        }
    }

}

