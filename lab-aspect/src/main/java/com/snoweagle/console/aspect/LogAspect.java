package com.snoweagle.console.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * Created by snoweagle on 8/13/16.
 */
@Aspect
public class LogAspect {
    @Pointcut("execution(* com.snoweagle.console.aspect.*.*(..))")
    public void pointcutExpression() {

    }

    /**
     * 1 前置通知
     *
     * @param joinPoint
     */
    @Before("pointcutExpression()")
    public void preMethod(JoinPoint joinPoint) {
        System.out.println("前置方法");
    }

    /**
     * 2 后置通知
     */
    @After("pointcutExpression()") // 在方法执行之后执行的代码. 无论该方法是否出现异常
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("后置通知执行了，有异常也会执行");
    }

    /**
     * 3 返回通知
     * <p>
     * 在方法法正常结束受执行的代码
     * 返回通知是可以访问到方法的返回值的!
     *
     * @param joinPoint
     * @param returnValue
     */
    @AfterReturning(value = "pointcutExpression()", returning = "returnValue")
    public void afterRunningMethod(JoinPoint joinPoint, Object returnValue) {
        System.out.println("返回通知执行，执行结果：" + returnValue);
    }

    /**
     * 4 异常通知
     * <p>
     * 在目标方法出现异常时会执行的代码.
     * 可以访问到异常对象; 且可以指定在出现特定异常时在执行通知代码
     *
     * @param joinPoint
     * @param e
     */
    @AfterThrowing(value = "pointcutExpression()", throwing = "e")
    public void afterThrowingMethod(JoinPoint joinPoint, Exception e) {
        System.out.println("异常通知, 出现异常 ：" + e);
    }

    /**
     * 环绕通知需要携带 ProceedingJoinPoint 类型的参数.
     * 环绕通知类似于动态代理的全过程: ProceedingJoinPoint 类型的参数可以决定是否执行目标方法.
     * 且环绕通知必须有返回值, 返回值即为目标方法的返回值
     */

    @Around("pointcutExpression()")
    public Object aroundMethod(ProceedingJoinPoint pjd) {

        Object result = null;
        String methodName = pjd.getSignature().getName();

        try {
            //前置通知
            System.out.println("The method " + methodName + " begins with " + Arrays.asList(pjd.getArgs()));
            //执行目标方法
            result = pjd.proceed();
            //返回通知
            System.out.println("The method " + methodName + " ends with " + result);
        } catch (Throwable e) {
            //异常通知
            System.out.println("The method " + methodName + " occurs exception:" + e);
            throw new RuntimeException(e);
        }
        //后置通知
        System.out.println("The method " + methodName + " ends");

        return result;
    }
}
