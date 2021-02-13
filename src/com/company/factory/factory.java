package com.company.factory;

// Duck duck;
//if(picnic){
//         duck = new MallardDuck();
// }else if(){
//         duck = new DecoyDuck();
// }else{
//         duck = new RubberDuck();
// }

// 1. simple factory: pizza store choose a specific factory
//   give the responsibility to the factory.
// 2. abstract factory

public class factory {
}
class Pizza{}
class CheesePizza extends Pizza{}
class ClamPizza extends Pizza{}
class VeggiePizza extends Pizza{}
class SimplePizzaFactory{
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("clam")){
            pizza = new ClamPizza();
        }else if(type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
class PizzaStore{
    SimplePizzaFactory factory;
    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = factory.createPizza(type);
//        pizza.prepare();
//        pizza.bake();
        return pizza;
    }
}

//2. abstract factory: factory method donnot inject to the method.
// multiple stores:franchiser
// the method is factory instead of the class.
//
abstract class PizzaStore2{
    abstract Pizza createPizza(String type);
    Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        return pizza;
    }
}
class NYPizzaStore extends PizzaStore2{
    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new CheesePizza();
        }else if(type.equals("clam")){
            return new ClamPizza();
        }else if(type.equals("veggie")){
            return new VeggiePizza();
        }else{
            return null;
        }
    }
}
