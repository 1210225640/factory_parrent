package factory;

/**
 * 2019/5/1
 * Creator:编程浪子
 */

public class FiedisFactory {

//    public  factory.IFiedis Plantend(String name){
//        if("种植花".equals(name)){
//          return  new factory.Flower();
//        }else if("种树木".equals(name)){
//           return new factory.Tree();
//        }else{
//            return  null;
//        }
//    }

    public IFiedis plant(Class<?extends IFiedis> clzz){

        try {
           if(null !=clzz){
               return  clzz.newInstance();
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }
}
