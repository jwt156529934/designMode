package com.jwt.designmode.create.singleton;

/**
 * @author jwt
 * @date 2020/6/8 4:14 下午
 * 饿汉式(静态常量）
 */
public class Singleton_1 {
    public static void main(String[] args) {
        Person instance1 = Person.getInstance();
        Person instance2 = Person.getInstance();
        System.out.println(instance1 == instance2);
    }
}
class Person{
    //1.构造器私有
    private Person(){};
    //2.在本类中创建一个对象
    public static final  Person person = new Person();
    //3.提供一个方法供外界获取对象
    public static Person getInstance(){
        return person;
    }
}
