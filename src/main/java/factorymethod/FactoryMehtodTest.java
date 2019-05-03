package factorymethod;

/**
 * 2019/5/1
 * Creator:编程浪子
 */

public class FactoryMehtodTest {

    public static void main(String[] args) {
        IFiedisFactory  fiedisFactory=new FlowerFactory();
        IFiedis fiedis=fiedisFactory.plant();
        fiedis.Plant();

        IFiedisFactory  fiedisFactorys=new TreeFactory();
        IFiedis fiedisd=fiedisFactorys.plant();
        fiedisd.Plant();
    }
}
