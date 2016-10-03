package de.agiledojo.rectangles;

import java.util.List;

public class Rectangles {
    public Rectangle outline(List<Rectangle> rectangles) {
        Rectangle outline = null;
        for (Rectangle rectangle: rectangles) {
              if  (outline == null) {
                  outline =rectangle.clone();
              } else {
                  if (rectangle.x < outline.x) {
                      outline.w += outline.x - rectangle.x;
                      outline.x = rectangle.x;
                  }
                  if (rectangle.getY() > outline.getY()) {
                      outline.w += rectangle.getY() - outline.getY();
                  }
              }
        }
        return outline;
    }
}
