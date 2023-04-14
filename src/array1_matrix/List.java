package array1_matrix;
// сортировка значений массива от болшего к меньшему
public class List {
      public static void main(String[] args) {
        int[] numbers = new int[]{9, 6, 7, 44};
        printArray(numbers);
        selection(numbers);
        printArray(numbers);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


    }

    public static void selection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }

            }
            if (i != min_i) {
                int temp = array[i];
                array[i] = array[min_i];
                array[min_i] = temp;
            }
        }

    }
}

