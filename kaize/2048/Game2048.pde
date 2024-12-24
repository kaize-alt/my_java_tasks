GameLogic game;

void setup() {
  size(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
  game = new GameLogic();
}

void draw() {
  background(Constants.BACKGROUND_COLOR.getRGB());
  drawGrid();
}

void drawGrid() {
  Tile[][] board = game.getBoard();

  for (int i = 0; i < Constants.BOARD_SIZE; i++) {
    for (int j = 0; j < Constants.BOARD_SIZE; j++) {
      int x = Constants.GRID_PADDING + j * (Constants.TILE_SIZE + Constants.GRID_PADDING);
      int y = Constants.GRID_PADDING + i * (Constants.TILE_SIZE + Constants.GRID_PADDING);

      fill(getTileColor(board[i][j]));
      rect(x, y, Constants.TILE_SIZE, Constants.TILE_SIZE);

      if (board[i][j] != null) {
        fill(0); // Цвет текста
        textSize(32);
        textAlign(CENTER, CENTER);
        text(board[i][j].getValue(), x + Constants.TILE_SIZE / 2, y + Constants.TILE_SIZE / 2);
      }
    }
  }
}

int getTileColor(Tile tile) {
  if (tile == null) {
    return color(204, 192, 179); // Цвет пустой плитки
  }

  switch (tile.getValue()) {
    case 2: return color(238, 228, 218);
    case 4: return color(237, 224, 200);
    case 8: return color(242, 177, 121);
    case 16: return color(245, 149, 99);
    case 32: return color(246, 124, 95);
    case 64: return color(246, 94, 59);
    default: return color(60, 58, 50); // Цвет для больших чисел
  }
}

void keyPressed() {
  if (keyCode == UP) game.move("UP");
  else if (keyCode == DOWN) game.move("DOWN");
  else if (keyCode == LEFT) game.move("LEFT");
  else if (keyCode == RIGHT) game.move("RIGHT");
}
