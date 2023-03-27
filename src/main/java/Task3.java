import java.util.ArrayList;
import java.util.Random;

public class Task3 {

    /**
     * Найдите пиковый элемент в двумерном массиве
     * Элемент является пиковым, если он больше или
     * равен своим четырем соседям слева, справа,
     * сверху и снизу. Например, соседями для A[i][j]
     * являются A[i-1][j], A[i+1][j], A[i][j-1] и A[i][j+1 ].
     * Для угловых элементов отсутствующие соседи считаются
     * отрицательными бесконечными значениями.
     * 10 20 15
     * 21 30 14
     * 7 16 32
     * Выход: 30
     * 30 — пиковый элемент, потому что все его
     * соседи меньше или равны ему.
     * 32 также можно выбрать в качестве пика.
     * note
     * 1 Смежная диагональ не считается соседней.
     * 2 Пиковый элемент не обязательно является максимальным элементом.
     * 3 Таких элементов может быть несколько.
     * 4 Всегда есть пиковый элемент.
     */
    static Random random = new Random();

    public static void searchPeekElement(int[][] arr) {
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                int a = arr[i][j];
                if (a >= arr[i - 1][j] &&
                        a >= arr[i + 1][j] &&
                        a >= arr[i][j - 1] &&
                        a >= arr[i][j + 1]) {
                    count++;
                    System.out.print(" " + count + "peek element:" + a + ",");
                    System.out.println(" ");
                }
            }
        }
    }

    public static int[][] fillArray() {

        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        //выводим массив
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = fillArray();
        searchPeekElement(arr);
    }
}