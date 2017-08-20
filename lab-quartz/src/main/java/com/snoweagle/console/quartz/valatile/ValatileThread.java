package com.snoweagle.console.quartz.valatile;

/**
 * Created by Patrick on 19/08/2017.
 */
public class ValatileThread implements Runnable {
    private   boolean isRun = true;

    @Override
    public void run() {
        while (isRun){
            System.out.println(Thread.currentThread().getName()+":"+System.currentTimeMillis());
        }
    }

    public void setRun(boolean run) {
        isRun = run;
    }
}
