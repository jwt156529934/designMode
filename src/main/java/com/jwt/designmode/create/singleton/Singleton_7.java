package com.jwt.designmode.create.singleton;

/**
 * @author jwt
 * @date 2020/6/9 11:49 上午
 * 枚举实现单例模式
 */
public class Singleton_7 {
    public static void main(String[] args) {
        Person_7 person7 = Person_7.PERSON_7;
        Person_7 person71 = Person_7.PERSON_7;
        System.out.println(person7 == person71);
    }
}
enum Person_7{
    PERSON_7;
}
