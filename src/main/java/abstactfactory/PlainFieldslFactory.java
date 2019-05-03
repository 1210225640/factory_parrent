package abstactfactory;

/**
 * 2019/5/1
 * Creator:编程浪子
 */
//田地的实现类
public class PlainFieldslFactory implements FiledisFactory {
    public IPetal createFlower() {
        return new PlainPetal();
    }

    public ILeaf createTree() {
        return new PlainLeaf();
    }
}
