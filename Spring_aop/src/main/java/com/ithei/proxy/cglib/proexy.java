package com.ithei.proxy.cglib;

//import com.ithei.proxy.jdk.Targetinterfece;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class proexy {
    public static void main(String[] args) {
        //目标对象
     final    Target target=new Target();
        //增强对象
        final Advice advice=new Advice();
        //返回值就是动他生成的代理对象 基于cglib
        //创建增强器
        Enhancer enhancer=new Enhancer();
        //设置父类
        enhancer.setSuperclass(Target.class);
        //设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[]args, MethodProxy methodProxy) throws Throwable {
                //执行前置
                advice.before();
                //执行目标
                method.invoke(target,args);
                //执行后置
                advice.afterRetRunning();
                return null;
            }
        });
        //设置代理对象
      Target o =(Target) enhancer.create();
      o.save();
    }
}
