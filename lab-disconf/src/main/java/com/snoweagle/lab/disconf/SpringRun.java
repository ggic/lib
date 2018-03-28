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
        Demo2Conf demo2Conf = (Demo2Conf)factory.getBean("demo2Conf");

        System.out.println("demoConf:"+demoConf);
        System.out.println("demo2Conf:"+demo2Conf);
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
                    System.out.println(LogWorker.json(demoConf));
                    System.out.println("<------");
                }
            }
        }).start();


        System.out.println(LogWorker.json(demo2Conf));

        TimeUnit.SECONDS.sleep(1000L);

    }


}
