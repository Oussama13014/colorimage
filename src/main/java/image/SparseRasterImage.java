package image;

import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arnaud Labourel on 23/11/2018.
 */
public class SparseRasterImage extends RasterImage{

    private Map<Point,Color> pixelsMap;

    SparseRasterImage(Color color, int width, int height) {
        super(color, width, height);
    }

    SparseRasterImage(Color[][] pixels) {
        super(pixels);
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return pixelsMap.getOrDefault(new Point(x,y), Color.WHITE);
    }

    @Override
    public void setPixelColor(Color color, int x, int y) {
        if (!color.equals(Color.WHITE))
            pixelsMap.put(new Point(x,y), color);
    }

    @Override
    public void createRepresentation() {
        pixelsMap = new HashMap<>();
    }
}
