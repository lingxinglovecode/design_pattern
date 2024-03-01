package org.example;

public class SingletonInnerClass {
    private SingletonInnerClass() {}
    // 静态内部类在该类被调用的时候加载
    private static class SingletonInnerClassHolder {
        private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }
    public static SingletonInnerClass getInstance() {
        // 调用时内部类加载并且初始化单例对象
        return SingletonInnerClassHolder.INSTANCE;
    }

    public static void main(String[] args) {
        SingletonInnerClass instance = SingletonInnerClass.getInstance();
        System.out.println(instance == SingletonInnerClass.getInstance());
    }
}
