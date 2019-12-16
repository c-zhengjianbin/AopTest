package com.zhengjianbin.aop;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhengjianbin on 2019/12/4.
 */
@Aspect
@Configuration
public class MyAspect {

    @Pointcut("execution(* com.zhengjianbin.controller..*.*(..))")
    public void businesService(){}

    @Before("com.zhengjianbin.aop.MyAspect.businesService()")
    public void doAccessCheck(JoinPoint joinPoint){
        Object[] objects = joinPoint.getArgs();
        System.out.println("获取到的参数：" + JSON.toJSONString(objects));
        System.out.println("已经执行方法调用前的拦截");
    }

}
