/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.snoweagle.lab.duboo.client;


import com.snoweagle.lab.duboo.server.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public final class Consumer {
    static ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    public static DemoService client = null;
    public static void main(String args[]) throws Exception {

        // START SNIPPET: client
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext(new String[]{"spring/dubbo-consumer.xml"});
        client = (DemoService) context.getBean("demoService");
        while (true) {
        if (1 == 1) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    String response = client.sayHi("Joe");
                    System.out.println(Thread.currentThread().getName() + " :Response: " + response);
                }
            });
        } else {
            break;
        }

        }



        // END SNIPPET: client
    }
}
