package de.agiledojo.rectangles;

public class Rectangle {
    int x;

    int y;

    int w;

    int h;


    public Rectangle(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", w=" + w +
                ", h=" + h +
                '}';
    }

    public Rectangle clone() {
        return new Rectangle(this.x,this.y,this.w,this.h);
    }

    public int getRightX() {
        return this.x + this.w;
    }

    public int getUpperY() {
        return this.y + this.h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (x != rectangle.x) return false;
        if (y != rectangle.y) return false;
        if (w != rectangle.w) return false;
        return h == rectangle.h;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + w;
        result = 31 * result + h;
        return result;
    }
}
