package org.example;

public class SingletonLazy {

    // 存储单例对象的属性必须是静态且私有的,静态是因为单例类的构造器是私有的,对外只提供一个获取单例对象
    // 的方法,由于外部不能直接创建对象,所以获取单例对象的方法一定是静态的,而在其中的单例类也一定为静态
    // 私有是防止该对象直接被外部获取,必须通过方法获取对象保证其始终不会被改变
    private static SingletonLazy instance;
    private SingletonLazy(){}

    // 添加sychronized关键字,保证线程安全,该方法每次只会有一个线程调用,另一个线程会等待
    public static synchronized SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
