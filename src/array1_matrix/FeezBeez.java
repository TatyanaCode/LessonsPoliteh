package array1_matrix;

public class FeezBeez {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Fez");
            } else if (i % 5 == 0) {
                System.out.println("Bez");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FezBez");
            }

        }
    }
}
