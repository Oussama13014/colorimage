package image;

import javafx.scene.paint.Color;
import util.Matrices;

/**
 * Created by Arnaud Labourel on 23/11/2018.
 */
public abstract class RasterImage extends AbstractImage {

    RasterImage(Color[][] colors) {

        Matrices.requiresNonNull(colors);
        Matrices.requiresNonZeroDimensions(colors);
        Matrices.requiresRectangularMatrix(colors);

        setWidth(Matrices.getRowCount(colors));
        setHeight(Matrices.getColumnCount(colors));

        createRepresentation();
        setPixelsColor(colors);
    }

    RasterImage(Color color, int width, int height) {
        super(width, height);

        createRepresentation();
        setPixelsColor(color);
    }

    public abstract void setPixelColor(Color color, int x , int y);

    public abstract void createRepresentation();

    private void setPixelsColor(Color[][] pixels){
        for(int x = 0; x<getWidth(); x++)
            for(int y = 0; y<getHeight(); y++){
                setPixelColor(pixels[x][y], x, y);
            }
    }

    private void setPixelsColor(Color color){
        for(int x = 0; x<getWidth(); x++)
            for(int y = 0; y<getHeight(); y++){
                setPixelColor(color, x, y);
            }
    }
}
