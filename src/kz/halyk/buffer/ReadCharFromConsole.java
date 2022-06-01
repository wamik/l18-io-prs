package kz.halyk.buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCharFromConsole {
    public static void main(String[] args) {
        char c = '1';
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Для выхода нажмите q");

        do {
            try {
                c = (char) br.read();
                if (c == 'q')
                    System.out.println("Выход из программы...");
                else
                    System.out.println(c);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (c != 'q');

    }
}
