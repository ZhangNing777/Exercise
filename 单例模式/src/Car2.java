/**
 * Created by apple on 2017/8/20.
 */
/*
饱汉式：优点是会节约内存，但是当多线程访问时会出现多个实例。
*/
public class Car2 {
    private Car2(){}

    private static Car2 car;

    public static Car2 getCar()
    {
        if(car == null)
        {
            car = new Car2();
        }
        return car;
    }
}

