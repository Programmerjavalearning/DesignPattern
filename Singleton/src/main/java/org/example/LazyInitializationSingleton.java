package org.example;

public class LazyInitializationSingleton {

    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton() {
    }


    public static LazyInitializationSingleton getInstance(){

        if (instance == null){
            instance = new LazyInitializationSingleton();
            System.out.println("Creating new Instance of Lazy Class");
            return instance;
        }

        System.out.println("Returning instance of Lazy Class");
        return instance;

    }

}
