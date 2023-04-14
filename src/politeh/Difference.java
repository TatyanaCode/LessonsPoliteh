package politeh;

import java.util.Scanner;

/**
 * 1) Вывести разность квадрата числ от 22 до 88 по первому числу строки
 * 2) вычислить значение произведения членов ряда.
  **/

public class Difference {
    public static void main(String[] args) {
      //  lab1_1();
        lab1_2();
   }

   private static void lab1_1(){

       for (int i = 22; i < 88; i++) {
            int result = i * i - (i + 1) * (i + 1);

            System.out.println(
                   String.format("%d^2 - %d^2 = %d", i, i + 1,
                    result));
       }

   }

    private static void lab1_2() {
        System.out.println("введите х");
        Scanner scanner= new Scanner(System.in);
        int x = scanner.nextInt();
        double result = 1;
        for(int i=1; i <= 4;i++){
            result *= (2 * i + 1 + Math.log(i * x))/ (2 * i);
        }
        System.out.println(result);
    }
}
