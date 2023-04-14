package array1_matrix;

import java.util.*;
import java.util.List;
// рандомное заполнение массива и вывод числа по индексу массива
public class RandomArray {
    public static void main(String[] args) {
        int[] array = new int[100];
        int index = 29;
        List<Integer> arrayList = new ArrayList<>();
        Map<String, Integer> arrayMap = new HashMap<>();
        String message = "Число ";
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int i1 = random.nextInt(100);
            array[i] = i1;
            arrayList.add(i1);
            arrayMap.put(message + i, i1);
        }
        System.out.println(array[index]);
        System.out.println(arrayList.get(index));
        System.out.println(arrayMap.get(message + index));
    }
}
