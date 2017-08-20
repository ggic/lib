package com.snoweagle.console.quartz;

import java.util.Date;
import java.util.UUID;




public class JobBean implements Runnable{
    private String name;
        public  void execute(){
                System.out.println(Thread.currentThread().getId()+Thread.currentThread().getName()+UUID.randomUUID()+new Date());
            try {
                 throw  new RuntimeException("出错了！！！！");
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    public JobBean(String name){
        this.name = name;
    }
    @Override
    public void run() {
        try{
            synchronized (this) {

                Thread.sleep(1000);
                System.out.println(name + " : " + Thread.currentThread().getId() + Thread.currentThread().getName() + new Date());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
