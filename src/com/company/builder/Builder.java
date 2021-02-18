package com.company.builder;

//Product
//Builder(abstract)
//Concrete Builder
//Director(projectManager)

// 客户-》项目经理 -》工人 有包含关系
public class Builder {
    public static void main(String[] args) {
        Builder2 b = new ConcreteBuilder();
        Director d = new Director(b);
        d.director();

    }
}
class Product{
    private String wall;
    private String TV;
    public void setWall(String wall) {
        this.wall = wall;
    }
    public void setTV(String TV) {
        this.TV = TV;
    }
    public void show(){
        System.out.println(wall+" "+TV);
    }
}

abstract class Builder2{
    Product product = new Product();
    abstract void buildWall();
    abstract void buildTV();
    abstract void show();

}
class ConcreteBuilder extends Builder2 {
    public void buildWall() {
        product.setWall("w1");
    }
    public void buildTV() {
        product.setTV("TV1");
    }
    public void show(){
        product.show();
    }
}
class Director{
    Builder2 b;
    public Director(Builder2 b){
        this.b = b;
    }
    void director(){
        b.buildWall();
        b.buildTV();
        b.show();

    }
}


