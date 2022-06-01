package kz.halyk;

import java.io.*;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {


        File file = new File("myfile.txt");

        try {

            if (!file.exists()) {
                boolean newFile = file.createNewFile();
                System.out.println("created:" + newFile);
            } else {
                System.out.println("File exists");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("isFile = " + file.isFile() + ", " +
                    "isDirectory = " + file.isDirectory() + ", " +
                    "name = " + file.getName() + ", " +
                    "absolutePath = " + file.getAbsolutePath() + ", " +
                    "path = " + file.getPath() + ", " +
                    "canonicalPath = " + file.getCanonicalPath() + ", " +
                    "parent = " + file.getParent()
            );
        } catch (IOException e) {
            System.out.println("Ошибка получения канонического пути");
        }


    }
}
