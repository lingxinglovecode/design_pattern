package org.example;

// 枚举类的方式创建单例
public enum SingletonEnum {
    INSTANCE;

    public static void main(String[] args) {
        SingletonEnum instance = SingletonEnum.INSTANCE;
        System.out.println(instance == SingletonEnum.INSTANCE);
    }
}
