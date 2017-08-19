import java.util.Scanner;

/*
题目：输入三个整数x,y,z，请把这三个数由小到大输出。

程序分析：我们想办法把最小的数放到x上，先将x与y进行比较，如果x>y则将x与y的值进行交换，然后再用x与z进行比较，
如果x>z则将x与z的值进行交换，这样能使x最小。
*/
/**
 * Created by apple on 2017/8/19.
 */
public class Arrange {
    public static void main(String[] args) {
        System.out.println("Please input three number:X,Y,Z.");
        Scanner n = new Scanner(System.in);
        System.out.print("X: ");
        int x = n.nextInt();
        System.out.print("Y: ");
        int y = n.nextInt();
        System.out.print("Z: ");
        int z = n.nextInt();
        compare(x,y,z);
    }

    private static void compare(int x,int y,int z)
    {
        int i;
        if(x>y)
        {
            i = x;
            x = y;
            y = i;
        }
        if(y>z)
        {
            i = y;
            y = z;
            z = i;
        }
        if(x>y)
        {
            i = x;
            x = y;
            y = i;
        }
        System.out.println(x+" "+y+" "+z);
    }
}
