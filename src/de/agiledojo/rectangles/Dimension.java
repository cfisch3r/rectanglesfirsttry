package de.agiledojo.rectangles;

/**
 * Created by retrorunner on 03.10.16.
 */
public class Dimension {
    int length;

    int ordinate;

    public Dimension(int outlineX, int outlineW) {
        this.length = outlineW;
        this.ordinate = outlineX;


    }

    private int endOrdinate() {
        return this.ordinate + this.length;
    }

    public Dimension add(Dimension newDim) {
        Dimension dimension = new Dimension(this.ordinate, this.length);
        if (newDim.endOrdinate()  > this.endOrdinate()) {
            dimension.length += newDim.endOrdinate() - this.endOrdinate();
        }

        if (newDim.ordinate < this.ordinate) {
            dimension.length += this.ordinate - newDim.ordinate;
            dimension.ordinate = newDim.ordinate;
        }

        return dimension;
    }
}
