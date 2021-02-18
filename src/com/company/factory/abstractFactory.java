package com.company.factory;

//工厂方法：animalFarm只是produce Animal
//养动物 + 养植物
//综合性工厂
// abstract factory
// concrete factory
// abstract product
// concrete product

public class abstractFactory{
    public static void main(String[] args) {
        Farm2 f2 = new ConcreteFarm2();
        Animal2 a2 = f2.produceAnimal();
        Plant2 p2 = f2.productPlant();
        a2.show();
        p2.show();

    }

}

interface Animal2{
    void show();
}
class Horse2 implements Animal2{
    @Override
    public void show() {
        System.out.println("Horse show");
    }
}

class Cattle2 implements Animal2{
    @Override
    public void show() {
        System.out.println("Cattle show");
    }
}


interface Plant2{void show();}
class Flower2 implements Plant2{
    @Override
    public void show() {
        System.out.println("Flower show");
    }
}
class Grass2 implements Plant2{
    @Override
    public void show() {
        System.out.println("Grass show");
    }
}

interface Farm2{
    Animal2 produceAnimal();
    Plant2 productPlant();
}
class ConcreteFarm2 implements Farm2{
    @Override
    public Animal2 produceAnimal() {
        return new Horse2();
    }

    @Override
    public Plant2 productPlant() {
        return new Grass2();
    }
}


