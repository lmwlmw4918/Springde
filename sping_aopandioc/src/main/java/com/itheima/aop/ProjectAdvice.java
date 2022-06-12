package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {
    @Pointcut("execution( * com.itheima.service.*Service.*(..))")
    private void servicept(){}
    @Around("ProjectAdvice.servicept()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            Object proceed = pjp.proceed();
        }
        long end = System.currentTimeMillis();
        //获取执行签名信息
        Signature signature = pjp.getSignature();
        System.out.println(signature);
        //通过前面获取执行类型（方法名）
        String sd = signature.getDeclaringTypeName();

        //获取执行操作的方法
        String name = signature.getName();

        System.out.println(name);
        System.out.println("业务接口万次执行实际为："+(end-start)+"ms");


    }

}
