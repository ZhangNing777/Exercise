import java.util.Scanner;

/**
 * Created by apple on 2017/10/5.
 */
/*
题目：写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
 */
public class Exercise038
{
    public static void main(String[] args) {
        System.out.println("Please input the character string:");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        char[] a = s.toCharArray();
        System.out.println("The length is: " + a.length);
    }
}
