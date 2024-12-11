import java.util.Scanner;

public class beec1287 {
    public static String strToInt(String palavra) {
        StringBuilder inteiro = new StringBuilder();
        String listaInt = "1234567890";
        boolean check = false;

        for (char letra : palavra.toCharArray()) {
            if (listaInt.indexOf(letra) != -1) {
                inteiro.append(letra);
            } else {
                if (letra == 'l') {
                    inteiro.append('1');
                } else if (letra == 'o' || letra == 'O') {
                    inteiro.append('0');
                } else if (letra != ',' && letra != ' ') {
                    check = true;
                    break;
                }
            }
        }

        try {
            int num = Integer.parseInt(inteiro.toString());
            if (num > 2147483647) {
                check = true;
            }
            return check ? "error" : String.valueOf(num);
        } catch (NumberFormatException e) {
            return "error";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                String entrada = scanner.nextLine();
                String result = strToInt(entrada);
                System.out.println(result);
            } catch (Exception e) {
                break;
            }
        }
        scanner.close();
    }
}
