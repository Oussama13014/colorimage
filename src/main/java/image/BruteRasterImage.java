package image;
import javafx.scene.paint.Color;

public class BruteRasterImage extends RasterImage {

    private Color[][] pixels;

    BruteRasterImage(Color color, int width, int height){
        super(color, width, height);
    }

    BruteRasterImage(Color[][] pixels) {
        super(pixels);
        this.pixels = pixels;
    }

    @Override
    public void createRepresentation() {
        pixels = new Color[getWidth()][getHeight()];
    }

    @Override
    public void setPixelColor(Color color, int x, int y) {
        pixels[x][y] = color;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return pixels[x][y];
    }
}
