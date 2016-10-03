package de.agiledojo.rectangles;

import java.util.List;

public class Rectangles {

    public Rectangle outline(List<Rectangle> rectangles) {
        Rectangle outline = null;
        for (Rectangle rectangle: rectangles) {
            outline = (outline == null)? rectangle.clone() : calculateOutline(outline, rectangle);
        }
        return outline;
    }

    private Rectangle calculateOutline(Rectangle outline, Rectangle rectangle) {
        Dimension dimensionX = (new Dimension(outline.x,outline.w)).add(new Dimension(rectangle.x,rectangle.w));
        Dimension dimensionY = (new Dimension(outline.y,outline.h)).add(new Dimension(rectangle.y,rectangle.h));
        outline = new Rectangle(dimensionX.ordinate,dimensionY.ordinate,dimensionX.length,dimensionY.length);
        return outline;
    }
}
