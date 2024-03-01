package org.example;

public class SingletonHungry {
    // 实例创建
    public static SingletonHungry instance = new SingletonHungry();

    // 私有化构造器
    private SingletonHungry() {
    }

    // 需要有一个获取实例的方法
    public static SingletonHungry getInstance() {
        return instance;
    }
}
