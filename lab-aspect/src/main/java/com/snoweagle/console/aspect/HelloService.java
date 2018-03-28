package com.snoweagle.console.aspect;

/**
 * Created by snoweagle on 8/13/16.
 */
public class HelloService {
    public String say(String st) {
        System.out.println("我："+st);
        return st;
    }
}
