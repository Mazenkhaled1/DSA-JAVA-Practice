package AdvancedTopices.Lambda;

import java.lang.Runnable;

public class Main {

    public static void main(String[] args) {

        FunInter fun = () -> System.out.println("Hello");

        doSomthing(fun);
    }

    public static void doSomthing(FunInter fun) {
        fun.Run();
    }
}
