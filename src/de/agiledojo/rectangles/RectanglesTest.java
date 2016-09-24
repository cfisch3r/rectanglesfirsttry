package de.agiledojo.rectangles;

import org.junit.Test;

import java.util.Arrays;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class RectanglesTest {

    @Test
    public void outlineSingleRectangle() {
        Rectangles rectangles = new Rectangles();
        assertEquals(new Rectangle(1,3,4,10), rectangles.outline(
                asList(new Rectangle(1,3,4,10))));
    }

    @Test
    public void outlineRectangleWithRightNeigbour() {
        Rectangles rectangles = new Rectangles();
        assertEquals(new Rectangle(1,3,12,10), rectangles.outline(
                asList(new Rectangle(1,3,4,10),new Rectangle(6,3,7,10))));
    }


}
