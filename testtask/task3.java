package testtask;

public class task3 {

    // Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}