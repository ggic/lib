package com.snoweagle.console.quartz.valatile;

import com.snoweagle.console.quartz.interrupt.BaseThread;

import java.util.concurrent.TimeUnit;

/**
 * Created by Patrick on 19/08/2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ValatileThread valatileThread = new ValatileThread();
        Thread thread = new Thread(valatileThread);
        thread.start();
//        TimeUnit.SECONDS.sleep(5);
        valatileThread.setRun(false);
    }
}
