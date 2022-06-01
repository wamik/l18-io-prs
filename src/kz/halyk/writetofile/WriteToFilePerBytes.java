package kz.halyk.writetofile;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFilePerBytes {

    public static void main(String[] args) {


        if (args.length != 1) {
            System.out.println("Неверное количество аргументов. Ожидается 1, найдено " + args.length);
            return;
        }
        FileOutputStream fos = null;
        BufferedInputStream bis = null;

        try {
            fos = new FileOutputStream(args[0]);
            bis = new BufferedInputStream(System.in);
//            new BufferedReader(new InputStreamReader(System.in))

            int c;
            do {
                c = bis.read();
                fos.write(c);
            } while (c != 'q');


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        } finally {

            try {
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Не удалось закрыть файл: " + e);
            }

            try {
                if (bis != null) bis.close();
            } catch (IOException e) {
                System.out.println("Не удалось закрыть входной поток: " + e);
            }

            System.out.println("Запись в файл завершена");
        }

    }


}
