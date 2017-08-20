/**
 * Created by apple on 2017/8/20.
 */
/*
饱汉式的优化，效率略低。
 */
public class Car3 {
    private Car3(){}

    private static Car3 car;

    public static synchronized Car3 getCar(){
        if(car == null) {
            car = new Car3();
        }
        return car;
    }
}
