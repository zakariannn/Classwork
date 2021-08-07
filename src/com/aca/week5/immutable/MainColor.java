package com.aca.week5.immutable;

public class MainColor {
    public static void main(String[] args) {
        Color color = new Color(5,5,5);
        System.out.println(color);

        change(color);
        //System.out.println(color.toString());
        color.toString();
        final Point point = new ImmutablePoint(5,5, new Color());
        Color color1 = point.GetColor();
        color1 = null;

    }

    public static Color change(Color color){
        color.toString();
        return color;
    }
}
