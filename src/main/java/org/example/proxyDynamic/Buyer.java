package org.example.proxyDynamic;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public interface Buyer {
    public void buy();

    public static void main(String[] args) {
        OrdinaryBuyer ordinaryBuyer = new OrdinaryBuyer();
        // lambda表达式的方式直接调用被代理对象
        Buyer proxyInstance = (Buyer)Proxy.newProxyInstance(ordinaryBuyer.getClass().getClassLoader(), ordinaryBuyer.getClass().getInterfaces(),
                (proxy, method, args1) -> {
                    System.out.println("Buyer Proxy!");
                    method.invoke(ordinaryBuyer, args1);
                    return null;
                });
        proxyInstance.buy();

        // 实现InvocationHandler接口的,这样就可以指定被代理类对象
        class DynamicProxyHandler implements InvocationHandler{
            private Object proxyObject;
            public DynamicProxyHandler(Object proxyObject){
                this.proxyObject = proxyObject;
            }

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("触发代理流程");
                method.invoke(proxyObject, args);
                return null;
            }
        }
        OrdinaryBuyer buyerObject = new OrdinaryBuyer();

        Buyer proxy = (Buyer) Proxy.newProxyInstance(buyerObject.getClass().getClassLoader(), buyerObject.getClass().getInterfaces(),
                new DynamicProxyHandler(buyerObject));
        proxy.buy();


    }
}

class OrdinaryBuyer implements Buyer {
    @Override
    public void buy() {
        System.out.println("Ordinary Buyer");
    }
}

