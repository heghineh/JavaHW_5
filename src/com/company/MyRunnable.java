package com.company;

public class MyRunnable implements java.lang.Runnable {

    @Override
    public void run() {
        int index = 0;
        while (true) {
            System.out.println("[" + ++index + "] Hello!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted!");
                break;
            }
        }
    }
}