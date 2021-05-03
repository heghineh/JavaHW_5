package com.company;

public class Main {
    /*
    Write an application that creates a background thread
    to repeatedly output Hello and then sleep for 100 milliseconds.
    After sleeping for 2 seconds, the default main thread should
    interrupt the background thread, which should break out of the
    loop after outputting interrupted
    */
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);

        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
    }
}