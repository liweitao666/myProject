package com.example.demo.thread.racecondition;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by jiaozhiguang on 2017/10/16.
 */
public class AtomicIntegerDemo {

    private static AtomicInteger counter = new AtomicInteger(0);

    static class Visitor extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                counter.incrementAndGet();
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int num = 100;
        Thread[] threads = new Thread[num];
        for (int i = 0; i < num; i++) {
            threads[i] = new Visitor();
            threads[i].start();
        }
        for (int i = 0; i < num; i++) {
            threads[i].join();
        }
        System.out.println(counter.get());
    }
}
