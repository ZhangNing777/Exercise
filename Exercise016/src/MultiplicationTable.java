import java.util.Arrays;

/*
题目：输出9*9口诀。

程序分析：分行与列考虑，共9行9列，i控制行，j控制列。
*/
/**
 * Created by apple on 2017/8/19.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        multiplication1();
        System.out.println();
        multiplication2();
    }

    private static void multiplication1()
    {
        for (int j=1;j<10;j++)
        {
            for(int i=1;i<10;i++)
            {
                System.out.print(i+"*"+j+"="+(i*j)+"   ");
            }
            System.out.println();
        }
    }

    private static void multiplication2()
    {
        String[][] a = new String[9][9];
        for (int i=0;i<9;i++)
        {
            for (int j = 0; j < 9; j++)
            {
                a[i][j]= (j+1)+"*"+(i+1)+"="+((i+1)*(j+1));
            }
        }
        for (int i=0;i<9;i++)
        {
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
