package image;

import javafx.scene.paint.Color;

import java.util.List;

/**
 * Created by Arnaud Labourel on 23/11/2018.
 */
public class VectorImage extends AbstractImage {

    private List<Shape> shapes;

    VectorImage(List<Shape> shapes, int width, int height) {
        super(width, height);
        this.shapes = shapes;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        for(Shape shape : shapes){
            if(shape.contains(new Point(x,y)))
                return shape.getColor();
        }
        return Color.WHITE;
    }
}
