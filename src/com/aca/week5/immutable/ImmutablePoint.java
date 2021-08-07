package com.aca.week5.immutable;

public final class ImmutablePoint implements Point, Cloneable{
    private final int x;
    private final int y;
    private final Color color;

    public ImmutablePoint(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = new Color(color);
    }

    @Override
    public int x() {
        return x;
    }

    @Override
    public int y() {
        return y;
    }

    @Override
    public Color GetColor() {
        //return new Color(color.getR(), color.getG(), color.getB());
       /* Color newColor = new Color(0,0,0);
        newColor.setR(this.color.r);
        newColor.setG(this.color.g);
        newColor.setB(this.color.b);
        return newColor;*/
        return color;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        final Point point = new ImmutablePoint(4,5,new Color());
        System.out.println();
        System.out.println(point.GetColor().getR());
        point.GetColor().setR(5);
        System.out.println(point.GetColor().getR());

    }
}
