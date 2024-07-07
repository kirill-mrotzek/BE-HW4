package com.telran.org.Homework;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {
        double m = 10.5;
        double n = 10.45;
        closeToTen(m, n);
        randomNumber();
    }

    public static void closeToTen(double m, double n) {
        double target = 10.0;
        double distanceM = Math.abs(target - m);
        double distanceN = Math.abs(target - n);

        if (distanceM < distanceN) {
            System.out.println(m + " is closer to 10");
        } else if (distanceN < distanceM) {
            System.out.println(n + " is closer to 10");
        } else {
            System.out.println("m and n are equal close to 10");
        }
    }

    public static void randomNumber() {
        Random random = new Random();
        int n = random.nextInt(28800);
        System.out.println("There are " + n + " seconds left");
        int m = (n / 3600);
        System.out.println("There are " + m + " hours left");
    }
}
