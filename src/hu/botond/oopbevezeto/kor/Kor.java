package hu.botond.oopbevezeto.kor;

import hu.botond.oopbevezeto.Main;
import hu.botond.oopbevezeto.pont.Pont;

public class Kor {

    private Pont center;
    private int radius;

    private double area;
    private double circumference;

    public Kor() {
        center = new Pont();
        center.randomCoordinate(10);
        int range = (10 - (-10)) + 1;
        radius = (int) (Math.random() * range) + (-10);
    }

    public Kor(int radius) {
        center = new Pont();
        this.radius = radius;
    }

    public Kor(Pont center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getArea() {

        area = Math.PI * (radius * radius);
        return area;
    }

    public double getCircumference() {
        circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public void changeRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Kor { " +
                "center: " + center +
                ", r=" + radius +
                " }";
    }
}
