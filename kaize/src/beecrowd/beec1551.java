import java.util.HashSet;
import java.util.Scanner;

public class beec1551 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        while (n-- > 0) {
            String s = scanner.nextLine();
            HashSet<Character> c = new HashSet<>();

            for (int i = 0; i < s.length(); i++) {
                if (Character.isLowerCase(s.charAt(i))) {
                    c.add(s.charAt(i));
                }
            }

            if (c.size() == 26) {
                System.out.println("frase completa");
            } else if (c.size() >= 13) {
                System.out.println("frase quase completa");
            } else {
                System.out.println("frase mal elaborada");
            }
        }

        scanner.close();
    }
}
