package politeh;

import java.util.Scanner;

public class IFElseif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        double a = scanner.nextInt();
        System.out.println("Введите число x");
        double x = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        double result;
        if (x < 3) {

            result = Math.exp(1 * x) + 1 / (a * x + 1);
        } else if (x == 3) {
            result = Math.sin(x) + Math.sqrt(x * a);
        } else {
            result = Math.cos(x) + Math.abs(b);
        }
        System.out.println(String.format("s = %.2f", result));
    }
}
