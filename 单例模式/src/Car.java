/**
 * Created by apple on 2017/8/20.
 */
/*
单例模式的最佳方案。内存占用低，效率高，线程安全.
 */
public class Car {
    private Car(){}

    private static volatile Car car;

    public static Car getCar()
    {
        if(car==null)
        {
            synchronized (Car.class)
            {
                if(car == null)
                {
                    car = new Car();
                }
            }
        }
        return car;
    }
}

