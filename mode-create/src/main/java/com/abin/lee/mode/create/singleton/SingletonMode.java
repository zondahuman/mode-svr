package com.abin.lee.mode.create.singleton;

/**
 * Created by abin on 2017/4/12 2017/4/12.
 * mode-svr
 * com.abin.lee.mode.create.singleton
 */
public class SingletonMode {

    private SingletonMode(){}

    private static class SingletonInner{
        private static SingletonMode instance = new SingletonMode();
    }

    public static SingletonMode getInstance(){
        return SingletonInner.instance;
    }

    public static void main(String[] args) {
        SingletonMode singletonMode1 = SingletonMode.getInstance();
        SingletonMode singletonMode2 = SingletonMode.getInstance();
        System.out.println(singletonMode1 == singletonMode2);
    }

}
