package kz.halyk.scanner;

import java.util.Scanner;

public class ReadIntFromConsole {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");


        int number = 0;
        // считывает данные из консоли и парсит их как integer
        if (sc.hasNextInt())
            number = sc.nextInt();
        else System.out.println("Поргуать пользователя");

        System.out.println("Спасибо! Вы ввели число " + number);

    }
}
