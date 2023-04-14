package politeh;

import java.util.Random;

public class ArraySize {
    public static void main(String[] args) {
        int[] numbers = new int[12];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        int tmp = 0;
        for (int num : numbers) {
            tmp += num;
        }
        tmp = tmp/numbers.length;
        numbers[4] = tmp;
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
