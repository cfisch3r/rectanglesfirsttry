package de.agiledojo.rectangles;

public class Rectangles {
    public Rectangle outline(Rectangle rectangle) {
        Rectangle outline = new Rectangle(rectangle.x,rectangle.y,rectangle.w,rectangle.h);
        return outline;
    }
}
