package com.snoweagle.console.quartz;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by snoweagle on 5/15/16.
 */
public class Queue {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> q = new ArrayBlockingQueue<String>(3);
        q.put("1");
        q.put("2");

        q.put("3");
        q.take();
        System.out.println(q);


    }


}
