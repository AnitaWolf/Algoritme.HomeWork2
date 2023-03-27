import java.util.ArrayList;

public class Task2 {
    /**
     * Имея два отсортированных массива размера m и n соответственно,
     * вам нужно найти элемент, который будет находиться на k-й позиции
     * в конечном отсортированном массиве.
     * Массив 1 - 100 112 256 349 770
     * Массив 2 - 72 86 113 119 265 445 892
     * к = 7
     * Вывод : 256
     * Окончательный отсортированный массив -
     * 72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
     * 7-й элемент этого массива равен 256.
     */
    static ArrayList<Integer> list = new ArrayList<>();

    private static int searchElement(int[] arr1, int[] arr2, int k) {
        int i = 0;
        int j = 0;
        int size1 = arr1.length;
        int size2 = arr1.length;
        while (i < size1 && j < size2) {
            int arr1Element = arr1[i];
            int arr2Element = arr2[j];
            if (arr1Element < arr2Element) {
                list.add(arr1Element);
                i++;
            } else {
                list.add(arr2Element);
                j++;
            }
        }
        while (i < size1) {
            list.add(arr1[i]);
            i++;
        }
        while (j < size2) {
            list.add(arr2[j]);
            j++;
        }
        return list.get(k);
    }

    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        System.out.println(searchElement(arr1, arr2, 7));
        System.out.println(list);
    }
}
