package com.snoweagle.lab.disconf;

import com.snoweagle.console.common.utils.LogWorker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * Created by Patrick on 28/03/2018.
 */
@Slf4j
public class SpringRun {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        final DemoConf  demoConf = (DemoConf)factory.getBean("demoConf");

        System.out.println("demoConf:"+demoConf);
        System.out.println(LogWorker.json(demoConf));



        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if(1!=1){
                        return;
                    }
                    try {
                        TimeUnit.SECONDS.sleep(2L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("------>");
                    System.out.println(LogWorker.json(DemoConf.getName()));
                    System.out.println("<------");
                }
            }
        }).start();



        TimeUnit.SECONDS.sleep(1000L);

    }


}
