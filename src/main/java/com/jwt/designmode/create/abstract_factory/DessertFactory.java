package com.jwt.designmode.create.abstract_factory;

/**
 * @author jwt
 * @date 2021/1/12 7:20 下午
 */
public interface DessertFactory {
    Coffee createCoffee();

    Dessert createDessert();
}
