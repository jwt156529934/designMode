package com.jwt.designmode.create.factory_method;

/**
 * @author jwt
 * @date 2021/1/12 6:48 下午
 */
public class Client {
    public static void main(String[] args) {
        //创建工厂对象
        //CoffeeFactory factory = new AmericanCoffeeFactory();
        CoffeeFactory factory = new LatteCoffeeFactory();

        //创建咖啡店对象
        CoffeeStore store = new CoffeeStore(factory);
        //点咖啡
        Coffee coffee = store.orderCoffee();

        System.out.println(coffee.getName());
    }
}
