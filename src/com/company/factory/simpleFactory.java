package com.company.factory;

import com.sun.org.apache.regexp.internal.RE;

// 简单工厂：
//1.通过名称创建对象
//2.增加一个对象 拓展工厂类getshape方法
//3.每增加一个产品 都要添加具体类和getshape中的实现
public class simpleFactory {
    public static void main(String[] args) {
        ShapeFactory f = new ShapeFactory();
        Shape cir = f.getShape("circle");
        cir.draw();

    }

}

interface Shape{
  void draw();
}
class Circle implements  Shape{
    @Override
    public void draw() {
        System.out.println("circle draw");
    }
}

class Rec implements Shape{
    @Override
    public void draw() {
        System.out.println("rec draw");
    }
}
class ShapeFactory{
    public Shape getShape(String shapeType){
        if(shapeType.equals("circle")){
            return new Circle();
        }else{
            return new Rec();
        }
    }
}


// 工厂方法 简单工厂只有一个工厂类 工厂方法有子类去完成
// 生产单一产品：只有getShape一个方法
// abstract factory(ShapeFactory2)
// concrete factory(ConcreteShapeFactory2)
// abstract product(Shape)
// concrete product(Circle)
// 1.Circle
// 2.shapeFactory2(boss do not know) ConcreteShapeFactory2(worker)
interface ShapeFactory2{
    Shape getShape(String shapeType);
}

class ConcreteShapeFactory2 implements ShapeFactory2{
    public Shape getShape(String shapeType){
        if(shapeType.equals("circle")){
            return new Circle();
        }else{
            return new Rec();
        }
    }
}


// abstract factory
interface Color {
    void fill();
}
//class Red implements Color {
//    @Override
//    public void fill() {
//        System.out.println("red fill");
//    }
//}
//class Green implements Color {
//    @Override
//    public void fill() {
//        System.out.println("green fill");
//    }
//}
//abstract class AbstractFactory {
////    两种产品
//    public abstract Color getColor(String color);
//    public abstract Shape getShape(String shape) ;
//}
//
//class ShapeFactory3 extends AbstractFactory {
//    @Override
//    public Shape getShape(String shapeType){
//        if(shapeType.equalsIgnoreCase("CIRCLE")){
//            return new Circle();
//        }else{
//            return new Rec();
//        }
//    }
//    @Override
//    public Color getColor(String color) {
//        return null;
//    }
//}
//public class ColorFactory3 extends AbstractFactory {
//
//    @Override
//    public Shape getShape(String shapeType){
//        return null;
//    }
//
//    @Override
//    public Color getColor(String color) {
//        if(color.equalsIgnoreCase("RED")){
//            return new Red();
//        } else {
//            return new Green();
//        }
//    }
//}
