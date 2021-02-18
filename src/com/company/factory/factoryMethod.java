package com.company.factory;

//养马 养牛
//工厂具体子类工厂决定实例化哪一个产品 特定的工厂产出特定的产品
//类的实例化延迟到其子类：product的实例化在具体的工厂类中实现
//客户端只知道什么工厂 不知道什么产品
//不违反开闭原则 只是拓展 the open-closed principle
public class factoryMethod {
    public static void main(String[] args) {
        AnimalFarm f = new HorseFarm();
        Animal h = f.produce();
        h.show();

    }
}

interface Animal{
    void show();
}
class Horse implements Animal{
    @Override
    public void show() {
        System.out.println("Horse show");
    }
}

class Cattle implements Animal{
    @Override
    public void show() {
        System.out.println("Cattle show");
    }
}

interface AnimalFarm{
    Animal produce();
}
class HorseFarm implements  AnimalFarm{
    @Override
    public Animal produce() {
        return new Horse();
    }
}

class CattleFarm implements  AnimalFarm{
    @Override
    public Animal produce() {
        return new Cattle();
    }
}



