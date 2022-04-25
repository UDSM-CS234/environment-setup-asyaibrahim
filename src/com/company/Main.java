package com.company;

public class Main {

    public static void main(String[] args) {
        double a = -9.81; // Earth's gravity in m/s^2
        double v1 = 0.0;
        double t = 10.0;
        double x1 = 0.0;
        double x;
        x = 0.5*a*(t*t) + v1*t +x1;
        System.out.println("The object's position after " + "fallingTime " +
                " seconds is " + x + " m.");
    }
}
