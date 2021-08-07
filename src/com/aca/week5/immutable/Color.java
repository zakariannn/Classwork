package com.aca.week5.immutable;

import java.util.Objects;

public class Color {
    public int r;
    public int g;
    public int b;

    public Color() {
        super();
    }

    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
    public Color(Color color){
        this.r = color.getR();
        this.g = color.getG();
        this.b = color.getB();
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        if (r >= 0 && r <= 255) {
            this.r = r;
        } else {
            System.out.println("invalid value");
            throw new RuntimeException();
        }
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Color)
        ) {

            return false;
        }
        if (o == this) {
            return true;
        }
        Color color = (Color) o;
        return color.r == this.r && color.g == this.g && color.b == this.b;

    }

    @Override
    public String toString() {
        return "Color{" +
                "r=" + r +
                ", g=" + g +
                ", b=" + b +
                '}';
    }
}
