package com.snoweagle.console.quartz;


import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.*;

/**
 * @author wangshaobo
 * @date 2016-8-2
 */
public class WebServer {
    private static ExecutorService executor = Executors.newFixedThreadPool(4);

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8888);
        while (true){
            executor.execute(new Task(socket));
        }
//        Future<List<String>> future=  executor.submit(new Task(socket));

//        System.out.println("==================");
//        try {
//            List<String> list = future.get();
//            System.out.println(list);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
//        socket.close();

    }


    static class Task implements  Runnable{
        private ServerSocket socket;
        public Task(ServerSocket socket){
            this.socket = socket;
        }
        @Override
        public void run()  {
            try {
                Socket sk = socket.accept();
                  List<String> list =IOUtils.readLines(sk.getInputStream());
            System.out.println(list);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}


