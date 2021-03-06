package com.jwt.designmode.create.singleton;

/**
 * @author jwt
 * @date 2020/6/9 11:12 上午
 * 懒汉式（线程不安全,一般不用）
 */
public class Singleton_3 {
    public static void main(String[] args) {
        Person_3 instance1 = Person_3.getInstance();
        Person_3 instance2 = Person_3.getInstance();
        System.out.println(instance1 == instance2);
    }
}
 class Person_3{
    private Person_3(){};
    private static Person_3 person_3;
    public static Person_3 getInstance(){
        if(person_3 == null){
            person_3 = new Person_3();
        }
        return person_3;
    }
 }
