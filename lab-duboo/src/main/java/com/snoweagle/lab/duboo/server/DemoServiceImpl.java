
package com.snoweagle.lab.duboo.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

public class DemoServiceImpl implements DemoService {
    public String sayHi( String text)   {
        System.out.println(Thread.currentThread().getName() +"--"+ text +"-->sayHi called");
        StackTraceElement[] stackElements = Thread.currentThread().getStackTrace();
        if (stackElements != null) {
            for (int i = 0; i < stackElements.length; i++) {
                System.out.print(stackElements[i].getClassName()+"/t");
                System.out.print(stackElements[i].getFileName()+"/t");
                System.out.print(stackElements[i].getLineNumber()+"/t");
                System.out.println(stackElements[i].getMethodName());
                System.out.println("-----------------------------------");
            }
        }

//        if (System.currentTimeMillis() % 2 == 0) {
//            throw new RuntimeException("系统错误啦~~~~");
//        }
        return "Hello: " + text;
    }
}
// END SNIPPET: service
