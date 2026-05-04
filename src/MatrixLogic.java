import java.util.Random;

/**
 * Клас MatrixLogic містить логіку для заповнення матриці.
 * Виконує пошук простих чисел у заданому діапазоні.
 * 
 * @author Alex Ruban
 */
public class MatrixLogic {

    /**
     * Заповнює матрицю випадковими простими числами.
     * 
     * @param matrix двовимірний масив для заповнення
     * @param start  початок діапазону
     * @param end    кінець діапазону
     */
    public static void fillArray(int[][] matrix, int start, int end) {
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int num;
                boolean simple;

                do {
                    num = random.nextInt(end - start + 1) + start;
                    simple = num > 1;
                    for (int m = 2; m * m <= num; m++) {
                        if (num % m == 0) {
                            simple = false;
                            break;
                        }
                    }
                } while (!simple);

                matrix[i][j] = num;
            }
        }
    }
}