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
        if(x<3) {
            System.out.println(Math.exp(1 * x) + 1 / Math.sin(x) + Math.sqrt(a * x));
        }if (x==3) {
            System.out.println(Math.sin(x)+Math.sqrt(x*a));

        }else if (x>3){
            System.out.println(Math.cos(x)+Math.abs(b));
        }
    }
}
