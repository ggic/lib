package com.snoweagle.console.quartz;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wangshaobo on 2016-5-5.
 */
public class LockTest {

    public static void main(String[] args) {
        final Outputer opt = new Outputer();
        final Object obj = new Object();
        while (true) {

            new Thread(){
                @Override
                public void run() {
                    synchronized (obj) {
                        opt.setValue("AAAAAAAAAAAAAAAAA");
                        System.out.println(Thread.currentThread().getName() + ":print:" + opt.value);
                        opt.outprintValue();
                    }
                }
            }.start();
                new Thread(){
                    @Override
                    public void run() {
                        synchronized (obj) {
                            opt.setValue("BBBBBBBBBBBBBBBBBBB");
                            System.out.println(Thread.currentThread().getName() + ":print:" + opt.value);
                            opt.outprintValue();
                        }
                    }
                }.start();
            }
    }

    private void init() {
        final Outputer outputer = new Outputer();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    outputer.output("aaaaaaaaaaa");
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    outputer.output("bbbbbbbbbbb");
                }

            }
        }).start();

    }

    static class Outputer {
        private String value ;
        public void output(String name) {
            int len = name.length();
                for (int i = 0; i < len; i++) {
                    System.out.print(name.charAt(i));
                }
        }
        public void  setValue(String value){
            this.value = value;
        }
        public void outprintValue(){
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < value.length(); i++) {
                System.out.print(value.charAt(i));
            }
            System.out.println("");
            System.out.println(Thread.currentThread().getName());
            System.out.println("");
        }

    }
}

