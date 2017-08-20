package com.snoweagle.console.quartz;

import java.util.concurrent.*;

/**
 * Created by wangshaobo on 2016-3-31.
 */
public class ThreadPollExecutorTest {


    public static void main(String[] args) throws InterruptedException {
            BlockingQueue<Runnable> queue  = new LinkedBlockingQueue<>(10);
         ExecutorService executor = new ThreadPoolExecutor(2, 4, 1, TimeUnit.MILLISECONDS,
               queue);


        for(int i =0;i<10;i++) {
            executor.execute(new JobBean("第 "+i+" 笔"));
            System.out.println("队列长度：" + queue.size());
         }
          executor.shutdown();
        System.out.println("executor.shutdown();");

        executor.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("End2");
    }




}
