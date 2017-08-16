/**
 * Created by apple on 2017/8/14.
 */
public class Number
{
    public static void main(String[] args)
    {
        number();
    }

    private static void number()
    {
        int n;
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<5;j++)
            {
                for(int k=1;k<5;k++)
                {
                    if(i==j||i==k||j==k)
                    {
                    }
                    else
                    {
                        n = i*100 + j*10 + k;
                        System.out.println(n);
                    }
                }
            }
        }
    }
}
