package com.snoweagle.console.aspect;

import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyShell;
import org.springframework.cglib.core.ReflectUtils;
import org.springframework.util.ReflectionUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Patrick on 09/01/2018.
 */
public class GroovyTest
{
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, IOException {
        File file = new File("/Users/user/IT/Dev/gitHub_project/laboratory/lab-aspect/src/main/java/com/snoweagle/console/aspect/HelloService.java");
        GroovyClassLoader groovyClassLoader = new GroovyClassLoader();
        Class clazz = groovyClassLoader.parseClass(file);
        HelloService helloService2 = new HelloService();
        HelloService helloService1= (HelloService)clazz.newInstance();
        GroovyShell shell =new GroovyShell();

        Object helloService =clazz.newInstance();
        Method sayMethod = ReflectionUtils.findMethod(helloService.getClass(), "say", String.class);
        ReflectionUtils.invokeMethod(sayMethod,helloService,"知道");

        System.out.println();

    }
}
