package de.agiledojo.rectangles;

import java.util.List;

public class Rectangles {
    public Rectangle outline(List<Rectangle> rectangles) {
        Rectangle outline = null;
        for (Rectangle rectangle: rectangles) {
              if  (outline == null) {
                  outline =new Rectangle(rectangle.x,rectangle.y,rectangle.w,rectangle.h);
              } else {
                  outline.w = (rectangle.x + rectangle.w - outline.x);
              }
        }
        return outline;
    }
}
