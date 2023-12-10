package org.example;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
            System.out.println("new thread safe instance");
            return instance;
        }
        System.out.println("returning thread safe instance");
        return instance;
    }



}
