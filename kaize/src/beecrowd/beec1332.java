import java.util.Scanner;

public class beec1332 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();

            if (str.length() == 5) {
                System.out.println(3);
            } else if ((str.charAt(0) == 'o' && str.charAt(1) == 'n') ||
                    (str.charAt(1) == 'n' && str.charAt(2) == 'e') ||
                    (str.charAt(0) == 'o' && str.charAt(2) == 'e')) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }

        scanner.close();
    }
}
