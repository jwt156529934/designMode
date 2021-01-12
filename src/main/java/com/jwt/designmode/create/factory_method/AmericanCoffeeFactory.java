package com.jwt.designmode.create.factory_method;

/**
 * @author jwt
 * @date 2021/1/12 7:01 下午
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanoCoffee();
    }
}
