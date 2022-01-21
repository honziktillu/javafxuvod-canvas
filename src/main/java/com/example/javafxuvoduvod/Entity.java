package com.example.javafxuvoduvod;

import javafx.scene.paint.Paint;

public class Entity {

    private double x;
    private double y;
    private double w;
    private double h;
    private Paint c;

    public Entity(double x, double y, double w, double h, Paint c) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.c = c;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public Paint getC() {
        return c;
    }

    public void setC(Paint c) {
        this.c = c;
    }
}
