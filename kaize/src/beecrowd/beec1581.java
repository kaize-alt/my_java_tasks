import java.util.Scanner;

public class beec1581 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        while (N-- > 0) {
            int K = scanner.nextInt();
            scanner.nextLine();

            String idiomaFinal = scanner.nextLine();

            for (int i = 1; i < K; i++) {
                String idioma = scanner.nextLine();

                if (!idioma.equals(idiomaFinal)) {
                    idiomaFinal = "ingles";
                }
            }

            System.out.println(idiomaFinal);
        }

        scanner.close();
    }
}
