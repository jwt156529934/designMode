package com.jwt.designmode.create.simple_factory;

/**
 * @author jwt
 * @date 2021/1/12 6:48 下午
 */
public class Client {
    public static void main(String[] args) {
        //创建咖啡店类对象
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("latte");

        System.out.println(coffee.getName());
    }
}
