package abstactfactory;

/**
 * 2019/5/1
 * Creator:编程浪子
 */

public class AbstactFiledisTest {

    public static void main(String[] args) {
        GrasslandFieldFactory grasslandFieldFactory=new GrasslandFieldFactory();
        grasslandFieldFactory.createFlower().load();
        grasslandFieldFactory.createTree().cut();
    }
}
