package com.snoweagle.console.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by snoweagle on 8/14/16.
 */
public class AspectTest {
    public static void main(String[] args) {
        ApplicationContext ax = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");

        /** 使用切面时，一定要这样写，不然无法注入bean **/
        HelloService service = (HelloService) ax.getBean("helloService");

        service.say("10200210201012");

    }
}
