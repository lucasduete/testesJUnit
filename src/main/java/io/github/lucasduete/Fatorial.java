package io.github.lucasduete;

public class Fatorial {

    public static long calcFatorial(int x) {
        if (x <= 1) return 1;
            else return x * calcFatorial(x-1);
    }
}
