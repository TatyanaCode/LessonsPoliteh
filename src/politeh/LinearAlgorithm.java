package politeh;
import java.math.RoundingMode;
import java.util.Scanner;
import java.lang.Math;


public class LinearAlgorithm {
    public static void main(String[] args) {
        // решение по второй фомуле
        Scanner scanner =new Scanner(System.in);
        System.out.println(" введите нужный градус для вычисления");
        double angleA = Math.toRadians(scanner.nextInt());
        double radianZ1 = Math.sin(angleA)+Math.cos(angleA)+Math.cos(3 * angleA) + Math.sin(3 * angleA);
        System.out.println(Math.round(radianZ1));
        // решение задачик по второй ормуле
        double a = 1.5;
        double pi = Math.PI;
        double z2 = 1.0 / 4.0 - 1.0 / 4.0 * Math.sin(5.0 / 2.0 * pi - 8.0 * a);
        System.out.println( z2);





    }



}
