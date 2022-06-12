package com.ithei.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

    public void before(){
        System.out.println("前置增强");
    }




    public void afterRunning(){
        System.out.println("后置增强");
    }

    //ProceedingJoinPoint joinPoint:正在执行的连接点==切点
    public Object around(ProceedingJoinPoint point) throws Throwable {

        System.out.println("环绕前执行");
        Object proceed = point.proceed();
        System.out.println("环绕后执行");
        return proceed;
    }


    public  void afterThrowing(){
        System.out.println("抛出异常执行");
    }
}
