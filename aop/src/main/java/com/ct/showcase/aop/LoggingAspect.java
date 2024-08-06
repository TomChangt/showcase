package com.ct.showcase.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.ct.showcase.ioc.*.*(..))")
    public void logBefore() {
        System.out.println("方法调用前记录日志...");
    }

    @After("execution(* com.ct.showcase.ioc.*.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("After method: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* com.ct.showcase.ioc.*.*(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("Method returned: " + result);
    }

    @AfterThrowing(pointcut = "execution(* com.ct.showcase.ioc.*.*(..))", throwing = "ex")
    public void logAfterThrowing(JoinPoint joinPoint, Exception ex) {
        System.out.println("Method threw exception: " + ex.getMessage());
    }

    @Around("execution(* com.ct.showcase.ioc.*.*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around before method: " + joinPoint.getSignature().getName());
        try {
            Object result = joinPoint.proceed();
            System.out.println("Around after method: " + joinPoint.getSignature().getName());
            return result;
        } catch (Throwable ex) {
            System.out.println("Around exception: " + ex.getMessage());
            throw ex;
        }
    }
}
