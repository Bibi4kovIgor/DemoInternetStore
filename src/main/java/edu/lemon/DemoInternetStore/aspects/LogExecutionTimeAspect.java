package edu.lemon.DemoInternetStore.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogExecutionTimeAspect {

    long start = 0;
    long end = 0;

    private static final Logger LOG = LoggerFactory.getLogger(LogExecutionTimeAspect.class);

    @Around("@annotation(edu.lemon.DemoInternetStore.annotations.LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();

        Object proceed = joinPoint.proceed();

        long executionTime = System.nanoTime() - start;
        LOG.info(String.format("Method %s was executed in %d ns", joinPoint.getSignature(), executionTime));
        return proceed;
    }

//    @Before("@annotation(edu.lemon.DemoInternetStore.annotations.LogExecutionTime)")
//    public Object logExecutionTimeStart(ProceedingJoinPoint joinPoint) throws Throwable {
//        start = System.nanoTime();
//
//        return joinPoint.proceed();
//    }
//
//    @After("@annotation(edu.lemon.DemoInternetStore.annotations.LogExecutionTime)")
//    public Object logExecutionTimeEnd(ProceedingJoinPoint joinPoint) throws Throwable {
//        Object proceed = joinPoint.proceed();
//        LOG.info(String.format("Method %s was executed in %d ns", joinPoint.getSignature(), end - start));
//        return proceed;
//    }
}
