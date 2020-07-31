package homework;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-04-26
 * Time:14:18
 * 一万年太久，只争朝夕，加油
 */

//产品接口
interface IProduct {
    void productMethod();
}
//实现产品接口的类产品类
class Product implements IProduct {
    public void productMethod() {
        System.out.println("产品");
    }
}
//工厂接口
interface IFactory {
    IProduct createProduct();
}
//实现工厂接口的工厂类
class Factory implements IFactory {
    public IProduct createProduct() {
        return new Product();
    }
}
//测试
public class Client {
    public static void main(String[] args) {
        //多态：父类引用，引用子类对象
        IFactory factory = new Factory();
        IProduct prodect = factory.createProduct();
        prodect.productMethod();
    }
}
