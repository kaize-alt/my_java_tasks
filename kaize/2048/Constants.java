import java.awt.Color;

public class Constants {
    public static final int BOARD_SIZE = 4;
    public static final int TILE_SIZE = 100;
    public static final int GRID_PADDING = 10;
    public static final int SCREEN_WIDTH = BOARD_SIZE * (TILE_SIZE + GRID_PADDING) + GRID_PADDING;
    public static final int SCREEN_HEIGHT = SCREEN_WIDTH;

    public static final Color BACKGROUND_COLOR = new Color(187, 173, 160);
    public static final Color TILE_COLOR = new Color(238, 228, 218);
}
