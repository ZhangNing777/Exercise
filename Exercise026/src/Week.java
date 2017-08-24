import java.util.Scanner;

/**
 * Created by apple on 2017/8/24.
 */
/*
题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续 判断第二个字母。

程序分析：用情况语句比较好，如果第一个字母一样，则判断用情况语句或if语句判断第二个字母。
Monday
Tuesday
Wednesday
Thursday
Friday
Saturday
Sunday
 */
public class Week {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input the first letter");
        String m = s.next();
        switch(m) {
            case "m":
                System.out.println("Monday");
                break;
            case "w":
                System.out.println("Wednesday");
                break;
            case "f":
                System.out.println("Friday");
                break;
            case "t":
                System.out.println("Please input the second number");
                String n = s.next();
                switch (n)
                {
                    case "u":
                        System.out.println("Tuesday");
                        break;
                    case "h":
                        System.out.println("Thursday");
                        break;
                    default:
                        System.out.println("Input error");
                }
                break;
            case "s":
                System.out.println("Please input the second number");
                String o = s.next();
                switch (o)
                {
                    case "a":
                        System.out.println("Saturday");
                        break;
                    case "u":
                        System.out.println("Sunday");
                        break;
                    default:
                        System.out.println("Input error");
                }
                break;
            default:
                System.out.println("Input error");
                break;
        }
    }


}
