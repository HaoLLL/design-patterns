package com.company.command;

import java.util.ArrayList;
import java.util.List;
//command pluggable adapter visitor
//interceptor service locator
// replace dispatcher with commands

//1. order; 2. executor(orderList; addOrder; executeOrder)

//1. encapsulate a  request
public class Command {
    public static void main(String[] args) {
//


    }
}
//Command(give breakfast order)
//Concrete Command
//Receiver(cooker)
//Invoker(waiter)
class Executor{
    private List<Order> orderList = new ArrayList<Order>();

    public void addOrder(Order order){
        orderList.add(order);
    }

    public void executeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
interface Order{
    void execute();
}
//receiver
class Stock {
    public void buy(){
        System.out.println("stock buy");
    }
    public void sell(){
        System.out.println("stock sell");
    }
}

class BuyStock implements Order{
//    private Stock stock;

    public BuyStock(){
//        this.stock = abcStock;
    }

    public void execute() {
        System.out.println("buy stock");
    }
}

class SellStock implements Order{
//    private Stock stock;

    public SellStock(){
//        this.stock = abcStock;
    }

    public void execute() {
        System.out.println("sell stock");
    }
}
