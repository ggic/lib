package com.snoweagle.console.quartz;

import org.apache.log4j.net.SocketServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author wangshaobo
 * @date 2016-8-2
 */
public class SocketClient {
    public static  void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("localhost", 8888);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        out.println(UUID.randomUUID().toString());
        out.flush();

        TimeUnit.SECONDS.sleep(20);
        out.println(UUID.randomUUID().toString());
        out.flush();
        out.close();
    }
}
