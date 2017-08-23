/**
 * Created by apple on 2017/8/23.
 */
/*
题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
 */
public class PingPongBall {
    public static void main(String[] args) {
        competitor();
    }

    private static void competitor()
    {
        String a[] = new String[3];
        String  b[] = new String[]{"x","y","z"};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    a[0]=b[i];
                    a[1]=b[j];
                    a[2]=b[k];
                    if(!a[0].equals(a[1])&&!a[0].equals(a[2])&&!a[1].equals(a[2])&&!a[0].equals("x")&&!a[2].equals("x")&&!a[2].equals("z"))
                    {
                        System.out.println("a: "+a[0]+"\nb: "+a[1]+"\nc: "+a[2]);
                    }
                }
            }
        }
    }
}
