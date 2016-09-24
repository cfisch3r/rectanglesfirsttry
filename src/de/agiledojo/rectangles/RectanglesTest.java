package de.agiledojo.rectangles;

import org.junit.Assert;
import org.junit.Test;

public class RectanglesTest {

    @Test
    public void outlineSingleRectangle() {
        Rectangle expected = new Rectangle(0,0,0,0);
        Rectangles rectangles = new Rectangles();
        Rectangle actual = rectangles.outline(new Rectangle(0,0,0,0));
        Assert.assertTrue(expected.x == actual.x && expected.y == expected.y
                && expected.w == actual.w && expected.h == actual.h);
    }
}
