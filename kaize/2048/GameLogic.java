import java.util.Random;

public class GameLogic {
    private Tile[][] board;
    private static final Random random = new Random();

    public GameLogic() {
        board = new Tile[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
        initializeBoard();
    }

    private void initializeBoard() {
        generateNewTile();
        generateNewTile();
    }

    public Tile[][] getBoard() {
        return board;
    }

    public void move(String direction) {
        // Реализация перемещения плиток (вверх, вниз, влево, вправо)
    }

    public void generateNewTile() {
        int x, y;
        do {
            x = random.nextInt(Constants.BOARD_SIZE);
            y = random.nextInt(Constants.BOARD_SIZE);
        } while (board[x][y] != null);

        board[x][y] = new Tile(random.nextDouble() < 0.9 ? 2 : 4);
    }

    public boolean isGameOver() {
        // Проверка, можно ли совершить ход
        return false;
    }
}
