package com.snoweagle.console.quartz;

import java.util.Random;

/**
 * Created by snoweagle on 5/4/16.
 */
public class Holder implements Runnable {
    private int n;

    public static void main(String[] args) {
        while (true) {
            new Thread(new Holder(new Random().nextInt())).start();
        }
    }

    public Holder() {
    }

    public Holder(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        Holder holder = new Holder(1);
        holder.xxx();

    }

    public void xxx() {
        if (n != n)
            throw new RuntimeException("不正确 ");
    }
}
