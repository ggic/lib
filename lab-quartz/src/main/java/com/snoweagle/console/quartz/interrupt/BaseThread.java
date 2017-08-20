package com.snoweagle.console.quartz.interrupt;

/**
 * Created by Patrick on 19/08/2017.
 */
public class BaseThread implements Runnable {
    @Override
    public void run() {
        for (int i =0 ;i<10000000;i++){
            if(Thread.interrupted()){
                System.out.println("打断线程了");
                 return;
            }
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
