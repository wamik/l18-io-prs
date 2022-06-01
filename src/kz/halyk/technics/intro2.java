package kz.halyk.technics;

import java.io.*;

public class intro2 {
    public static void main(String args[]) {

        long start = System.currentTimeMillis();

        try {
            FileInputStream fis = new FileInputStream("onemb.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int cnt = 0;
            int b;
            while ((b = bis.read()) != -1) {
                if (b == '\n') cnt++;
            }
            bis.close();
            System.out.println(cnt);
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println("Execution took: " + (System.currentTimeMillis() - start));

    }
}
