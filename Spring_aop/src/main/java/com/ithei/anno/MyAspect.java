package com.ithei.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect//标注当前myaspect是一个切面类
public class MyAspect {

    //配置前置通知
    @Before(value = "execution(* *.*.anno.*.*())")
    public void before(){
        System.out.println("前置增强");
    }



    @AfterReturning("MyAspect.pointcut()")
    public void afterRunning(){
        System.out.println("后置增强");
    }

    //ProceedingJoinPoint joinPoint:正在执行的连接点==切点
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {

        System.out.println("环绕前执行");
        Object proceed = point.proceed();
        System.out.println("环绕后执行");
        return proceed;
    }


    public  void afterThrowing(){
        System.out.println("抛出异常执行");
    }

    @Pointcut("execution(* *.*.anno.*.*())")
    public  void pointcut(){}
}
