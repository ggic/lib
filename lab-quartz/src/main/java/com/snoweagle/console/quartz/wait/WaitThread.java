package com.snoweagle.console.quartz.wait;

/**
 * Created by Patrick on 20/08/2017.
 */
public class WaitThread extends Thread{
    Object lock;

    public WaitThread(String name, Object lock) {
        super(name);
        this.lock = lock;
    }


    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName()+":lock前");
                lock.wait();
                System.out.println(Thread.currentThread().getName()+":lock后");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
