package factorymethod;

/**
 * 2019/5/1
 * Creator:编程浪子
 */

public class TreeFactory implements IFiedisFactory {
    public IFiedis plant() {
        return new Tree();
    }
}
