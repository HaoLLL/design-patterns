package com.company.bridge;


public class Bridge {
    public static void main(String[] args) {
        DrawAPI red = new RedCircle();

    }
}

// 1. 桥梁 展开成好几种实现类
// 2. 构造或set中设置实现类 方法中执行桥梁方法
interface DrawAPI{
    public void drawCircle();
}


class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle() {
        System.out.println("green draw");
    }
}

class RedCircle implements DrawAPI{
    @Override
    public void drawCircle() {
        System.out.println("red draw");
    }
}
abstract class Shape{
    DrawAPI drawAPI;
    public Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract  void draw();
}
class Circle extends Shape {

    public Circle(DrawAPI drawAPI) {
        super(drawAPI);
    }

    public void draw() {
        drawAPI.drawCircle();
    }
}



