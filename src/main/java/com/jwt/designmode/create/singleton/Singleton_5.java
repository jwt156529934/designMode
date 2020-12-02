package com.jwt.designmode.create.singleton;

/**
 * @author jwt
 * @date 2020/6/9 11:20 上午
 * 双重检查代码(推荐）
 */
public class Singleton_5 {
    public static void main(String[] args) {

    }
}

class Person_5 {
    private Person_5() {}
    private static volatile Person_5 person_5;

    public static Person_5 getInstance() {
        if (person_5 == null) {
            synchronized (Person_5.class) {
                if (person_5 == null) {
                    person_5 = new Person_5();
                }
            }
        }
        return person_5;
    }
}
