package com.dp.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingleton {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(()-> System.out.println(Singleton.getInstance()));
        executorService.execute(()-> System.out.println(Singleton.getInstance()));
        executorService.execute(()-> System.out.println(Singleton.getInstance()));
        executorService.execute(()-> System.out.println(Singleton.getInstance()));
        executorService.execute(()-> System.out.println(Singleton.getInstance()));
        executorService.close();
    }
}
