package com.jwt.designmode.create.abstract_factory;

/**
 * @author jwt
 * @date 2021/1/12 7:22 下午
 */
public class AmericanDessertFactory implements DessertFactory {
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
