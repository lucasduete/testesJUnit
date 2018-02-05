package io.github.lucasduete;

import io.github.lucasduete.exceptions.InvalidNumberException;

public class Cubo {

    public static double areaDoLado(int area) {

        if (area <= 0)
            throw new InvalidNumberException();

        return Math.pow(area, 2);
    }

    public static double areaLateral(int area) {

        if (area <= 0)
            throw new InvalidNumberException();

        return (4 * (Math.pow(area, 2)));
    }

    public static double areaTotal(int area) {

        if (area <= 0)
            throw new InvalidNumberException();

        return (6 * (Math.pow(area, 2)));
    }

    public static double volume(int area) {

        if (area <= 0)
            throw new InvalidNumberException();

        return Math.pow(area, 3);
    }
}
