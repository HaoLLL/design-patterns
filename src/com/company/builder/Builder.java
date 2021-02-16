package com.company.builder;

//Product
//Builder(abstract)
//Concrete Builder
//Director(projectManager)
public class Builder {
    public static void main(String[] args) {
        Builder2 b = new ConcreteBuilder();
        ProjectManager manager = new ProjectManager(b);
    }
}

class Product {
    private String wall;
    public void setWall(String wall) {
        this.wall = wall;
    }
    public void show() {
        System.out.println(wall);
    }
}

abstract class Builder2 {
    //创建产品对象
    Product product = new Product();
    public abstract void buildWall();
    //返回产品对象
    public Product getWall() {
        return product;
    }
}

class ConcreteBuilder extends Builder2 {
//    Product product = new Product();
    public void buildWall() {
        product.setWall("build wall");
    }
}
class ProjectManager {
    private Builder2 builder;
    public ProjectManager(Builder2 builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Product construct() {
        builder.buildWall();
        return builder.getWall();
    }
}