import java.util.Arrays;
import java.util.Scanner;

/**
 * Клас Main є точкою входу в програму.
 * Забезпечує інтерфейс користувача для введення параметрів матриці
 * та виведення результату заповнення її простими числами.
 * 
 * @author Alex Ruban
 */
public class Main {

    /**
     * Головний метод для виконання програми.
     * Виконує валідацію введених даних та викликає логіку.
     * 
     * @param args аргументи командного рядка
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        // Змінна для зберігання розміру матриці
        byte n;

        /**
         * Цикл для створення розміру матриці, згідно умови(сам придумав, не треба
         * велика матриця)
         */
        while (true) {
            System.out.print("Введіть порядок матриці (до 10-ти): ");
            if (n > 0 && n <= 5) {
                System.out.println("Сталася помилка. Порядок має бути числом від 1 до 5.");
                break;
            }
            n = Byte.parseByte(myObj.nextLine());
        }

        int[][] matrix = new int[n][n];

        // Введення меж діапазону
        System.out.print("Введіть початок діапазону цифр: ");
        int start = Integer.parseInt(myObj.nextLine());

        System.out.print("Введіть кінець діапазону цифр: ");
        int end = Integer.parseInt(myObj.nextLine());

        // Виклик методу для заповнення матриці
        MatrixLogic.fillArray(matrix, start, end);

        // Виведення результату на екран
        System.out.println("\nРезультат заповнення матриці:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        myObj.close();
    }
}