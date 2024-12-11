import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("Первое рациональное число:");
            String input1 = in.nextLine();
            if (input1.equalsIgnoreCase("^D")) break;
            Rational r1 = new Rational(input1);

            System.out.println("Операция:");
            String sign = in.nextLine();
            if (sign.equalsIgnoreCase("^D")) break;

            System.out.println("Второе рациональное число:");
            String input2 = in.nextLine();
            if (input2.equalsIgnoreCase("^D")) break;
            Rational r2 = new Rational(input2);

            Rational result = null;

            switch (sign) {
                case "+":
                    result = r1.add(r2);
                    System.out.println("Результат: " + result.getNum() + "/" + result.getDen());
                    break;
                case "-":
                    result = r1.subtract(r2);
                    System.out.println("Результат: " + result.getNum() + "/" + result.getDen());
                    break;
                case "*":
                    result = r1.multiply(r2);
                    System.out.println("Результат: " + result.getNum() + "/" + result.getDen());
                    break;
                case ":":
                    result = r1.divide(r2);
                    System.out.println("Результат: " + result.getNum() + "/" + result.getDen());
                    break;
                default:
                    System.out.println("Только + - * :");
            }
        }
    }
}
