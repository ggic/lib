package com.snoweagle.console.quartz.wait;

import com.snoweagle.console.quartz.valatile.ValatileThread;

/**
 * Created by Patrick on 19/08/2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        WaitThread t1 = new WaitThread("t1",lock);
        WaitThread t2 = new WaitThread("t2",lock);
        t1.start();
        t2.start();

        System.out.println("------");
        synchronized (lock){
            lock.notifyAll();
        }
        System.out.println("------22");
    }
}
