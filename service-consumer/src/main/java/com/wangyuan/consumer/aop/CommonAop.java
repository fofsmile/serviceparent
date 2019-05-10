package com.wangyuan.consumer.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @program: serviceparent
 * @description: 通用AOP
 * @author: WangYuan
 * @create: 2019-05-10 16:48
 */
@Component
@Aspect
public class CommonAop {
    private Logger log = LoggerFactory.getLogger(CommonAop.class);

    @Pointcut("execution(public * com.wangyuan.consumer..*.*(..))")
    public void MethodLog(){

    }

    //@Before("MethodLog()")
    public void beforeMethod() throws Throwable {
        //String name = point.proceed().getClass().getName();
        System.out.println("切入成功 name is ");
    }
    //@After("MethodLog()")
    public void afterMethod() {
        System.out.println("切入结束");
    }

    //@Around("MethodLog()")
    public void aroundMethod(ProceedingJoinPoint point) throws Throwable {
        String name = point.getSignature().getName();
        System.out.println("name is "+name);
    }
}
