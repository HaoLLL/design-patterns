package com.company.adapter;

public class adapterDP {
}

//Duck->TurkeyAdapter implements Duck(turkey)->Turkey
interface Duck{
    public void quack();
    public void fly();
}
class MallardDuck implements Duck{

    @Override
    public void quack() {

    }

    @Override
    public void fly() {

    }
}
interface Turkey{
    void gobble();
    void fly();
}
class WildTurkey implements Turkey{

    @Override
    public void gobble() {

    }

    @Override
    public void fly() {

    }
}
class TurkeyAdapter implements Duck{
    Turkey turkey;
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {

    }

    @Override
    public void fly() {

    }
}