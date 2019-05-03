package abstactfactory;

import factory.Flower;

/**
 * 2019/5/1
 * Creator:编程浪子
 */

public interface FiledisFactory {

    IPetal  createFlower();

    ILeaf    createTree();
}
