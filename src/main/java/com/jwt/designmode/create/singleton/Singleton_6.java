package com.jwt.designmode.create.singleton;

/**
 * @author jwt
 * @date 2020/6/9 11:42 上午
 * 静态内部类（推荐）
 */
public class Singleton_6 {
    public static void main(String[] args) {

    }
}
class Person_6{
    private Person_6(){}
    private static volatile Person_6 person_6;

    private static class PersonInstance{
        private static final Person_6 PERSON_6 = new Person_6();
    }

    private static Person_6 getInstance(){
        return PersonInstance.PERSON_6;
    }
}
