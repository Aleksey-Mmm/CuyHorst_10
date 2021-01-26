package primery.lambda.ch6_6;

import java.util.function.IntConsumer;

public class Lam2 {
    public static void main(String[] args) {
        repeat(5, ()-> System.out.println("Hi!"));
        repeatCons(10, i-> System.out.println("Countdown: "+ (10 - i)));

    }
//Runnable - интерфейс (ничего не возвращает и без параметров), который может реализовываться лямбда выражением
    public static void repeat(int col, Runnable action) {
        for (int i = 0; i < col; i++) {
            action.run();
        }
    }

    //IntConsumer ничего не возвращает, но с параметром типа int
    public static void repeatCons(int col, IntConsumer action) {
        for (int i = 0; i < col; i++) {
            action.accept(i);
        }
    }
}
