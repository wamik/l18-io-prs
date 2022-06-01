package kz.halyk.buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadStringFromConsole {

    public static void main(String[] args) {
        String str = null;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строки текста");
        System.out.println("Введите 'стоп' для завершения");

        do {
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(str);
        } while (!str.equals("стоп"));


    }
}
