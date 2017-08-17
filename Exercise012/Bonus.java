import java.util.Scanner;

/*
题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？

程序分析：请利用数轴来分界，定位。注意定义时需把奖金定义成长整型。
*/
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
