package de.agiledojo.rectangles;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class RectanglesTest {

    private Rectangles rectangles;

    private List<Rectangle> fixture = new ArrayList<>();

    @Before
    public void setUp() {
        rectangles = new Rectangles();
    }

    @Test
    public void outlineSingleRectangle() {
        withRectangle(1,3,4,10).assertOutlineToBe(1,3,4,10);
    }

    @Test
    public void outlineRectangleWithLeftNeigbour() throws Exception {
        withRectangle(1,3,4,10).withRectangle(0,3,4,10).assertOutlineToBe(0,3,5,10);
    }

    @Test
    public void outlineRectangleWithRightNeigbour() throws Exception {
        withRectangle(1,3,4,10).withRectangle(2,3,4,10).assertOutlineToBe(1,3,5,10);
    }

    private RectanglesTest withRectangle(int x, int y, int w, int h) {
        fixture.add(new Rectangle(x,y,w,h));
        return this;
    }

    private void assertOutlineToBe(int x, int y, int w, int h) {
        assertEquals(new Rectangle(x,y,w,h),rectangles.outline(fixture));
    }
}
