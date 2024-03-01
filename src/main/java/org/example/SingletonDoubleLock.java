package org.example;

public class SingletonDoubleLock {
    private SingletonDoubleLock() {}

    // volatile关键字是为了防止指令重排序,当发生指令重排的时候可能会出现对象不为null但是还没有初始化的现象
    private static volatile SingletonDoubleLock instance;

    // 双重检查锁的方式,提升性能
    public static SingletonDoubleLock getInstance() {
        if (instance == null) {
            // 加锁是为了保证创建对象的过程只会有一个线程调用
            synchronized (SingletonDoubleLock.class) {
                if (instance == null) {
                    instance = new SingletonDoubleLock();
                }
            }
        }
        return instance;
    }
}
