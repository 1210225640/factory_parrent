package abstactfactory;

/**
 * 2019/5/1
 * Creator:编程浪子
 */

public class GrasslandFieldFactory implements FiledisFactory {
    public IPetal createFlower() {
        return new GrasslandPetal();
    }

    public ILeaf createTree() {
        return new GrasslandLeaf();
    }
}
