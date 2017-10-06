import java.util.Scanner;

/**
 * Created by apple on 2017/10/5.
 */
public class Exercise039 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input a number.");
        int n = s.nextInt();
        number(n);
    }

    static void number(int n)
    {
        if(n%2==0)
            even(n);
        else
            odd(n);
    }

    static void even(int n)
    {
        double sum = 0;
        for(int i=2;i<n+1;i=i+2)
        {
            sum = sum + 1.0/i;
        }
        System.out.println("Result: "+sum);
    }

    static void odd(int n)
    {
        double sum = 0;
        for(int i=1;i<n+1;i=i+2)
        {
            sum = sum + 1.0/i;
        }
        System.out.println("Result: "+sum);
    }
}
