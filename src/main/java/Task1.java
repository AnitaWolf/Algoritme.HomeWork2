public class Task1 {

    /**Имея отсортированный массив arr[] и число x,
     *  напишите функцию, которая подсчитывает
     *  вхождения x в arr[]. Ожидаемая временная
     *  сложность O(Log n)
     arr[] = {1, 1, 2, 2, 2, 2, 3,}
     x = 2
     Вывод: 4 раза

     */

    public  static int SearchOfNQuantity(int[] array,int num){
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==num){
                count++;
            }
        }return count;
    }

    public static void main(String[] args) {
        int[] arr ={1, 1, 2, 2, 2, 2, 3,};
        System.out.println(SearchOfNQuantity(arr, 2));
    }
}
