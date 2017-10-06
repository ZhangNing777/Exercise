/**
 * Created by apple on 2017/10/6.
 */
/*
题目：海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一个扔入海中，拿走了
一份。第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只猴子
都是这样做的，问海滩上原来最少有多少个桃子？
 */
public class Exercise040 {
    public static void main(String[] args) {
        int a = peach(0);
        System.out.println("Peach: "+ a);
    }

    private static int peach(int n)
    {
        if(n==5)
            return 1;
        else
            return peach(n+1)*5+1;
    }
}

