package homework;

/**
 * Created with IntelliJ IDEA.
 * Description:抽象工厂模式
 * User:wanghuimin
 * Date:2020-04-26
 * Time:15:00
 * 一万年太久，只争朝夕，加油
 */
//水果工厂（抽象产品）
interface Fruit {
    void printInfo();
}
//具体产品
class Apple implements Fruit{
    @Override
    public void printInfo() {
        System.out.println("苹果");
    }
}
class Banana implements Fruit{
    @Override
    public void printInfo() {
        System.out.println("香蕉");
    }
}
//蔬菜工厂（抽象产品）
interface Vegetable {
    public void printInfo();
}
//具体产品
class Tomato implements Vegetable{
    @Override
    public void printInfo() {
        System.out.println("西红柿");
    }
}
class Cabbage implements Vegetable{
    @Override
    public void printInfo() {
        System.out.println("白菜");
    }
}
//具体工厂
class FruitFactory extends PlantFactory{
    public static final int APPLE=1;
    public static final int BANANA=2;
    public static final int ORANGE=3;
    @Override
    public Fruit getFruit(int fruitType){
        if(fruitType==APPLE){
            return new Apple();
        }
        if(fruitType==BANANA){
            return new Banana();
        }
        return null;
    }
    @Override
    Vegetable getVegetable(int vegetableType) {
        return null;
    }
}
class VegetableFactory extends PlantFactory {
    public static final int CABBAGE=1;
    public static final int TOMATO=2;
    public static final int EGGPLANT=3;
    @Override
    Fruit getFruit(int fruitType) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Vegetable getVegetable(int vegetableType) {
        // TODO Auto-generated method stub
        if(vegetableType==CABBAGE){
            return new Cabbage();
        }
        if(vegetableType==TOMATO){
            return new Tomato();
        }
        return null;
    }
}
//抽象工厂
abstract class PlantFactory {
    abstract Fruit getFruit(int fruitType);
    abstract Vegetable getVegetable(int vegetableType);
}
//生产工厂的工厂
public class Plantation {
    public static final int FRUIT = 1;
    public static final int VEGETABLE = 2;

    public static PlantFactory getFactory(int factoryType) {
        if (factoryType == FRUIT) {
            return new FruitFactory();
        }
        if (factoryType == VEGETABLE) {
            return new VegetableFactory();
        }
        return null;
    }

    public static void main(String[] args) {
        FruitFactory fruitFactory = (FruitFactory) Plantation.getFactory(Plantation.FRUIT);
        Apple apple = (Apple) fruitFactory.getFruit(FruitFactory.APPLE);
        apple.printInfo();
        VegetableFactory vegetableFactory = (VegetableFactory) Plantation.getFactory(Plantation.VEGETABLE);
        Tomato tomato = (Tomato) vegetableFactory.getVegetable(VegetableFactory.TOMATO);
        tomato.printInfo();
    }
}