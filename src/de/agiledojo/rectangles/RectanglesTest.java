package de.agiledojo.rectangles;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class RectanglesTest {

    private Rectangles rectangles;

    @Before
    public void setUp() {
        rectangles = new Rectangles();
    }

    @Test
    public void outlineSingleRectangle() {
        assertEquals(new Rectangle(1,3,4,10), rectangles.outline(
                asList(new Rectangle(1,3,4,10))));
    }

    @Test
    public void outlineRectangleWithRightNeigbour() {
        assertEquals(new Rectangle(1,3,12,10), rectangles.outline(
                asList(new Rectangle(1,3,4,10),new Rectangle(6,3,7,10))));
    }


}
