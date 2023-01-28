package testtask;

import java.util.Scanner;

public class task2 {

    // Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести
    // "Нет такого имени"

    public static void main(String[] args) {
        // пользователь вводит имя
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();

        if (name.equals ("Вячеслав")) {
            System.out.println("Привет,  Вячеслав!");
        } else
            System.out.println("Нет такого имени");
    }
}
