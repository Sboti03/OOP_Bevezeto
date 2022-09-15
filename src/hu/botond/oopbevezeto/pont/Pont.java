package hu.botond.oopbevezeto.pont;

import java.util.Random;

public class Pont {

    private int x;
    private int y;


    public Pont() {
        x = 0;
        y = 0;
    }

    public Pont(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getXCoordinate() {
        return x;
    }

    public int getYCoordinate() {
        return y;
    }

    public void setXCoordinate(int x) {
        this.x = x;
    }

    public void setYCoordinate(int y) {
        this.y = y;
    }

    public void setCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void randomCoordinate(int n) {
            int range = (n - (-n)) + 1;
            x = (int) (Math.random() * range) + (-n);
        y = (int) (Math.random() * range) + (-n);
    }

    public double distanceFromOrigo() {
        return Math.sqrt((0 - x) * (0 - x) + (0 - y) * (0 - y));
    }

    public int getQuarter() {
        int state = 0;
        if (x > 0 && y > 0){
            state = 4;
        } else if (x > 0) {
            state = 3;
        } else if (x < 0 && y < 0) {
            state = 2;
        } else if(x < 0 && y > 0) {
            state = 1;
        }
        return  state;
    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y;
    }
}
