package de.agiledojo.rectangles;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectanglesTest {

    @Test
    public void outlineSingleRectangle() {
        Rectangles rectangles = new Rectangles();
        assertEquals(new Rectangle(1,3,4,10), rectangles.outline(new Rectangle(1,3,4,10)));
    }

}
