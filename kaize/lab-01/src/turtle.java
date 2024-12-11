import java.util.Scanner;

public class turtle {
    
    private static final char[][] AREA_OF_TURTLE = new char[20][20];

    private static boolean penDown = false;

    private static int x = 0;

    private static int y = 0;

    private static int direction = 1;

    private static final int UP = 1;

    private static final int RIGHT = 2;

    private static final int DOWN = 3;

    private static final int LEFT = 4;

    public static void Main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            String command = in.next();
            switch (command) {
                case "Init":
                    for (int i = 0; i < AREA_OF_TURTLE.length; i++) {
                        for (int j = 0; j < AREA_OF_TURTLE[i].length; j++) AREA_OF_TURTLE[i][j] = ' ';
                    }
                    System.out.println("Площадка инициализирована.");
                    break;

                case "Print":
                    for (int i = 0; i < AREA_OF_TURTLE.length; i++) {
                        for (int j = 0; j < AREA_OF_TURTLE[i].length; j++) {
                            if (i == y && j == x) {
                                System.out.print("*");
                            } else {
                                System.out.print(AREA_OF_TURTLE[i][j] + ".");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case "PenUp":
                    penDown = false;
                    System.out.println("Перо поднято.");
                    break;

                case "PenDown":
                    penDown = true;
                    System.out.println("Перо опущено.");
                    break;

                case "TurnRight":
                    direction = (direction % 4) + 1;
                    System.out.println("Поворот направо.");
                    break;

                case "TurnLeft":
                    direction = (direction - 2 + 4) % 4 + 1;
                    System.out.println("Поворот налево.");
                    break;

                case "Move":
                    int numberOfPositions = in.nextInt();
                    for (int i = 0; i < numberOfPositions; i++) {
                        switch (direction) {
                            case UP:
                                if (y > 0) y--;
                                break;
                            case DOWN:
                                if (y < AREA_OF_TURTLE.length - 1) y++;
                                break;
                            case RIGHT:
                                if (x < AREA_OF_TURTLE[0].length - 1) x++;
                                break;
                            case LEFT:
                                if (x > 0) x--;
                                break;
                        }
                        if (penDown) {
                            AREA_OF_TURTLE[y][x] = '*';
                        }
                    }
                    System.out.println("Черепаха переместилась.");
                    break;

                case "Exit":
                    System.out.println("Выход из программы.");
                    return;

                default:
                    System.out.println("Неизвестная команда.");
            }
        }
    }
}
