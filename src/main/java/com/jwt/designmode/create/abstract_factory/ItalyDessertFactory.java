package com.jwt.designmode.create.abstract_factory;

/**
 * @author jwt
 * @date 2021/1/12 7:23 下午
 */
public class ItalyDessertFactory implements DessertFactory {

    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    public Dessert createDessert() {
        return new Trimisu();
    }
}
