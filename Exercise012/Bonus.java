import java.util.Scanner;

/**
 * Created by apple on 2017/8/17.
 */
public class Bonus {
    public static void main(String[] args) {
        long a;
        System.out.println("Please input the profit");
        Scanner n = new Scanner(System.in);
        a = n.nextLong();
        bonus(a);
    }

    private static void bonus(long profit)
    {
        long m = 0;
        long n = profit;

        if(profit>1000000){

        profit = n-1000000;

        n = 1000000;

        m = (long) (m + profit*0.01);

    }

        if(profit>600000){

            profit = n-600000;

            n = 600000;

            m = (long) (m + profit*0.015);

        }

        if(profit>400000){

            profit = n-400000;

            n = 400000;

            m = (long) (m + profit*0.03);

        }

        if(profit>200000){

            profit = n-200000;

            n = 200000;

            m = (long) (m + profit*0.05);

        }

        if(profit>100000){

            profit = n-100000;

            n = 100000;

            m = (long) (m + profit*0.075);

        }

        m = (long) (m + n*0.1);

        System.out.println("Bonus: "+m);
    }
}
