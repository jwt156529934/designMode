package com.jwt.designmode.create.singleton;

/**
 * @author jwt
 * @date 2020/6/9 11:17 上午
 * 懒汉式（线程安全,但是效率慢，不推荐）
 */
public class Singleton_4 {
    public static void main(String[] args) {
        Person_4 instance1 = Person_4.getInstance();
        Person_4 instance2 = Person_4.getInstance();
        System.out.println(instance1 == instance2);
    }
}
class Person_4{
    private Person_4(){};
    private static Person_4 person_4;
    public static synchronized Person_4 getInstance(){
        if(person_4 == null){
            person_4 = new Person_4();
        }
        return person_4;
    }
}
