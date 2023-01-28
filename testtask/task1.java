package testtask;

import java.util.Scanner;

public class task1 {

    // Составить алгоритм: если введенное число больше 7, то вывести “Привет”

    public static void main(String[] args) {
        // пользователь вводит число
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = input.nextInt();

        if (number < 7) {
            System.out.println("Введите число больше 7");
        } else if (number == 7) {
            System.out.println("Введите число больше 7");
        } else {
            System.out.println("Привет");
        }
    }
}
