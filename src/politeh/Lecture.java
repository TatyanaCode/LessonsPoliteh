package politeh;

import java.util.Scanner;

/**
 * Код по 2 блок схемам  продемонстрированны на лекции
 */

public class Lecture {
    public static void main(String[] args) {


        lecture();
        lecture2();
    }

    public static int lecture() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите х");
        int x = scanner.nextInt();
        System.out.println("введите а");
        int a = scanner.nextInt();
        System.out.println("введите n");
        int n = scanner.nextInt();
        int y = 0;
        if (x > 2) {
            for (int i = 1; i < n; i++) {
                y += i;
            }
        } else if (x < 2) {
            y = (int) (a * Math.pow(x, 2));
        } else {
            System.out.println("Нет решений");

        }
        // System.out.println(y);
        return y;
    }

    public static void lecture2() {
        int y;
        for (int z = -3; z < 6; z++) {
            if (z < 3) {
                for (int x = 1; x <= 5; x++) {
                    y = z + (x * x);
                    System.out.print(y);
                }
            } else if (z > 4) {
                for (int x = 1; x <= 5; x++) {
                    y = (x * x) - z;
                    System.out.println(y);
                }
            } else {
                System.out.println("  нет решения ");
            }
        }
    }
}

