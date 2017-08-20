/**
 * Created by apple on 2017/8/20.
 */
/*
饿汉式：

 优点是：不存在多线程同步问题，避免了synchronized所造成的性能问题；

 缺点是：当类被加载的时候，静态变量被创建并分配内存空间，对象便一直占着这段内存。
         当类被卸载时，静态变量被摧毁，并释放所占有的内存，因此在某些特定条件下会耗费内存。
*/
public class Car1 {
    private Car1(){}

    private static final Car1 car = new Car1();

    public static Car1 getCar()
    {
        return car;
    }
}
