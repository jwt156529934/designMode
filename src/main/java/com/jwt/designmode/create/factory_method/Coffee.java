package com.jwt.designmode.create.factory_method;

/**
 * @author jwt
 * @date 2021/1/12 6:42 下午
 */
public abstract class Coffee {
    public abstract String getName();

    public void addMilk(){
        System.out.println("加奶");
    }
    public void addsugar(){
        System.out.println("加糖");
    }
}
