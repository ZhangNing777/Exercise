import java.util.Scanner;

/*
题目：输入某年某月某日，判断这一天是这一年的第几天？

程序分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本年的第几天.
特殊情况：闰年且输入月份大于3时需考虑多加一天。
*/
/**
 * Created by apple on 2017/8/18.
 */
public class Date {
    public static void main(String[] args) {
        System.out.println("Please input the year, month and day.");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int month = scan.nextInt();
        int day = scan.nextInt();
        day(year,month,day);
    }

    private static void day(int year,int month,int day)
    {
        int date = 0;
        if(year%4==0&&month>2)
        {
            date = date+1;
        }
        switch (month)//31 28 31 30 31 30 31 31 30 31 30 31
        {
            case 1:
                date = date + day;
                break;
            case 2:
                date = date + 31 + day;
                break;
            case 3:
                date = date + 59 + day;
                break;
            case 4:
                date = date + 90 + day;
                break;
            case 5:
                date = date + 120 + day;
                break;
            case 6:
                date = date + 151 + day;
                break;
            case 7:
                date = date + 181 + day;
                break;
            case 8:
                date = date + 212 + day;
                break;
            case 9:
                date = date + 243 + day;
                break;
            case 10:
                date = date + 273 + day;
                break;
            case 11:
                date = date + 304 + day;
                break;
            case 12:
                date = date + 334 + day;
                break;
        }
        System.out.println("Date: " + date);
    }
}
