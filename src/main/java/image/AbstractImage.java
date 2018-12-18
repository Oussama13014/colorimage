package image;

import javafx.scene.paint.Color;

/**
 * Created by Arnaud Labourel on 23/11/2018.
 */
public abstract class AbstractImage implements Image{
    private int width;
    private int height;

    AbstractImage(int width, int height) {
        this.width = width;
        this.height = height;
    }

    AbstractImage() {
        this(0,0);
    }

    @Override
    public abstract Color getPixelColor(int x, int y);

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    void setWidth(int width) {
        this.width = width;
    }

    void setHeight(int height) {
        this.height = height;
    }
}
