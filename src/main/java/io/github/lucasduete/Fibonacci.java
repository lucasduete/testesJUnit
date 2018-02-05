package io.github.lucasduete;

public class Fibonacci {

    public static long calcFibonacci (int x) {

        if (x <= 0) return 0;
        else
            if ((x == 1) || (x == 2)) return 1;
        else
            return calcFibonacci(x - 1) + calcFibonacci(x - 2);
    }

}
