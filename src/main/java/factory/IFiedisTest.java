package factory;

/**
 * 2019/5/1
 * Creator:编程浪子
 */

public class IFiedisTest {

    public static void main(String[] args) {
        FiedisFactory  courseFactory=new FiedisFactory();
        IFiedis fied=courseFactory.plant(Tree.class);
        fied.Plant();

    }
}
