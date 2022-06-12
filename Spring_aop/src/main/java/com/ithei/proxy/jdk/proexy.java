package com.ithei.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class proexy {
    public static void main(String[] args) {
        Target target=new Target();
        Advice advice=new Advice();
        //返回值动态生成代理对象
     Targetinterfece proxy=(Targetinterfece)  Proxy.newProxyInstance(
                target.getClass().getClassLoader(), //目标对象类加载器
                //目标对象相同接口的字节对象数组
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    //调用代理对象的任何方法 实质执行的都是invoke'
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        advice.before();
                        method.invoke(target,args);
                        advice.afterRetRunning();
                        return null;

                    }
                }
        );

     //调用代理对象的方法
        proxy.save();
    }
}
