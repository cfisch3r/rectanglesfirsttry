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
    public void outlineRectangleWithLeftNeigbour() throws Exception {
        assertEquals(new Rectangle(0,3,5,10), rectangles.outline(
                asList(new Rectangle(1,3,4,10),new Rectangle(0,3,4,10))));

    }

    @Test
    public void outlineRectangleWithRightNeigbour() throws Exception {
        assertEquals(new Rectangle(1,3,5,10), rectangles.outline(
                asList(new Rectangle(1,3,4,10),new Rectangle(2,3,4,10))));

    }
}
