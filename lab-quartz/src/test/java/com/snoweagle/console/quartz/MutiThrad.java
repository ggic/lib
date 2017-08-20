package com.snoweagle.console.quartz;

/**
 * Created by snoweagle on 5/2/16.
 */
public class MutiThrad {
    private static int num = 0;
    private static boolean ready;

    public static void main(String[] args) throws InterruptedException {

        new ReaderThread().start();
        Thread.currentThread().sleep(10000);
        num = 20;
        ready = true;
    }


    public void handle() {
        num--;
    }

    private static class ReaderThread extends Thread {
        public void run() {
            while (!ready)
                Thread.yield();
            System.out.println(num);


        }
    }
}
