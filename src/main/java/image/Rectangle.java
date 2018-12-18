package image;

import javafx.scene.paint.Color;

/**
 * Created by Arnaud Labourel on 23/11/2018.
 */
public class Rectangle implements Shape {
    private int x;
    private int y;
    private int width;
    private int height;
    Color color;

    Rectangle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public boolean contains(Point point) {
        return x <= point.x && point.x <= x+width
                && y <= point.y && point.y <= y+height;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
