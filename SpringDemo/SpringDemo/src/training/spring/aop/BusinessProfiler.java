package training.spring.aop;


import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class BusinessProfiler {
 
        @Pointcut("execution(* training.spring.aop.*.*(..))")
        public void businessMethods() { }
 
               
        @Before("businessMethods()")
        public void MyBeforeMethod(){
        	System.out.println("Applying Before advice");
        }
        
        @After("businessMethods()")
        public void MyAfterMethod(){
        	System.out.println("Applying After advice");
        }
 
        
        @Around("businessMethods()")
        public Object profile(ProceedingJoinPoint pjp) throws Throwable {
                long start = System.currentTimeMillis();
                System.out.println("Going to call the method.");
                Object output = pjp.proceed();
                System.out.println("Method execution completed.");
                long elapsedTime = System.currentTimeMillis() - start;
                System.out.println("Method execution time: " + elapsedTime + " milliseconds.");
                return output;
        }
        
}