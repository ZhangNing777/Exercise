/*
题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
*/
/**
 * Created by apple on 2017/8/17.
 */
public class PerfectSquire {
    public static void main(String[] args) {
        perfectSquire(10000);
    }

    private static void perfectSquire(int n)
    {
        int a = 0;
        for (int i=0;i<n;i++)
        {
            if(Math.floor(Math.sqrt(i+100))==Math.sqrt(i+100) && Math.floor(Math.sqrt(i+168))==Math.sqrt(i+168))
            //if(Math.sqrt(i+100)%1==0 && Math.sqrt(i+168)%1==0)
            {
                System.out.println(i);
            }
        }
    }
}
