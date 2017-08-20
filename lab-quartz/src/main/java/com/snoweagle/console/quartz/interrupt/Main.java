package com.snoweagle.console.quartz.interrupt;

import java.util.concurrent.TimeUnit;

/**
 * Created by Patrick on 19/08/2017.
 */
public class Main {
    public static void main(String[] args)   {
        BaseThread baseThread = new BaseThread();
        Thread thread = new Thread(baseThread);
        thread.start();

        try {
            TimeUnit.SECONDS.sleep(2);

            System.out.println(Thread.currentThread().getName()+"打断");
            thread.interrupt();
            System.out.println("打断后1:"+thread.interrupted());

            System.out.println("打断后:"+thread.isInterrupted());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
