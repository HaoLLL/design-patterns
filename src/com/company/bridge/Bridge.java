package com.company.bridge;

public class Bridge {
    public static void main(String[] args) {
        Rec r = new Rec();
        White w = new White();
        r.setColor(w);
        r.draw();

    }
}

abstract class Shape{
    Color color;
    public void setColor(Color color){
        this.color = color;
    }
    abstract void draw();
}
interface Color{
    public void print();
}
class White implements Color{
    @Override
    public void print() {
        System.out.println("print white");
    }
}
class Rec extends Shape{
    @Override
    void draw() {
        color.print();
    }
}
