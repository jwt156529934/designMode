package com.jwt.designmode.create.singleton;

/**
 * @author jwt
 * @date 2020/6/8 4:14 下午
 * 饿汉式(静态代码块）
 */
public class Singleton_2 {
    public static void main(String[] args) {
        Person_2 instance1 = Person_2.getInstance();
        Person_2 instance2 = Person_2.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class Person_2 {
    //1.构造器私有
    private Person_2() {
    };
    //2.在本类中创建一个对象
    public static Person_2 person;
    static {
        person = new Person_2();
    }
    //3.提供一个方法供外界获取对象
    public static Person_2 getInstance() {
        return person;
    }
}
