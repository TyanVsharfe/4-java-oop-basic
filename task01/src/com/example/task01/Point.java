package com.example.task01;

public class Point {
    int x;
    int y;

    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.println(toString());
    }

    void flip() {
        int temp = -(this.x);
        this.x = -(this.y);
        this.y = temp;
    }

    double distance (Point point) {
        return Math.sqrt(Math.pow((this.x - point.x),2) + Math.pow((this.y - point.y),2));
    }

    public String toString () {
        return String.format("(%d,%d)",this.x,this.y);
    }
}
