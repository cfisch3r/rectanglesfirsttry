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
                  if (rectangle.y < outline.y) {
                      outline.h += outline.y - rectangle.y;
                      outline.y = rectangle.y;
                  }
                  if (rectangle.getRightX() > outline.getRightX()) {
                      outline.w += rectangle.getRightX() - outline.getRightX();
                  }
                  if (rectangle.getUpperY() > outline.getUpperY()) {
                      outline.h += rectangle.getUpperY() - outline.getUpperY();
                  }
              }
        }
        return outline;
    }
}
