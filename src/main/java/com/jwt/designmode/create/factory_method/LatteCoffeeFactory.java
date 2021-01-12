package com.jwt.designmode.create.factory_method;

/**
 * @author jwt
 * @date 2021/1/12 7:00 下午
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
