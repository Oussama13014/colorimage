package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arnaud Labourel on 23/11/2018.
 */
public class PaletteRasterImage extends RasterImage {

    private List<Color> palette;
    private int[][] indexesOfColors;

    PaletteRasterImage(Color color, int width, int height) {
        super(color, width, height);
    }

    PaletteRasterImage(Color[][] pixels) {
        super(pixels);
    }

    @Override
    public void setPixelColor(Color color, int x, int y) {
        int indexOfColor = palette.indexOf(color);

        if(indexOfColor < 0){
            palette.add(color);
            indexOfColor = palette.indexOf(color);
        }

        indexesOfColors[x][y] = indexOfColor;
    }

    @Override
    public void createRepresentation() {
        palette = new ArrayList<>();
        indexesOfColors = new int[getWidth()][getHeight()];
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return palette.get(indexesOfColors[x][y]);
    }
}
