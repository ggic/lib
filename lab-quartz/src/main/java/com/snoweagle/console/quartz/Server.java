package com.snoweagle.console.quartz;

import java.awt.*;
import java.util.concurrent.*;

/**
 * Created by snoweagle on 5/13/16.
 */
public class Server {
    private static ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

    public Server() {
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        call();
    }

    private void run() {
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread("线程-" + i);
            executor.execute(thread);
            System.out.printf("%s,%s,%s,%s", thread.getName(), executor.getPoolSize(), executor.getActiveCount(), executor.getCompletedTaskCount());
            System.out.println();
        }
    }

    private static void call() throws ExecutionException, InterruptedException {
        Callable callable = new Callable() {
            @Override
            public Object call() throws Exception {

                TimeUnit.SECONDS.sleep(10);
                return "Suc";
            }
        };

        Future future = executor.submit(callable);
        while (!future.isDone()) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(future.isDone());
        }
        System.out.println(future.get());
    }
}
