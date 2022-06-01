package kz.halyk.technics;

import java.io.*;

public class intro1 {
    public static void main(String args[]) throws IOException {


        long start = System.currentTimeMillis();
        try {
            FileInputStream fis = new FileInputStream("onemb.txt");
            int cnt = 0;
            int b;
            while ((b = fis.read()) != -1) {
                if (b == '\n') cnt++;
            }
            fis.close();
            System.out.println(cnt);
        } catch (IOException e) {
            System.err.println(e);
        }

        System.out.println("Execution took: " + (System.currentTimeMillis() - start));
    }

}