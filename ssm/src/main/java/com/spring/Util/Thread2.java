package com.spring.util;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        for (int i=100;i<200;i++){
            System.out.println("线程二：------------------------------"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
