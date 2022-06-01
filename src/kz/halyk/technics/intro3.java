package kz.halyk.technics;

import java.io.*;

public class intro3 {
    public static void main(String args[]) {

        long start = System.currentTimeMillis();

        try {
            FileInputStream fis = new FileInputStream("onemb.txt");
            byte buf[] = new byte[2048];
            int cnt = 0;
            int n;
            while ((n = fis.read(buf)) != -1) {
                for (int i = 0; i < n; i++) {
                    if (buf[i] == '\n') cnt++;
                }
            }
            fis.close();
            System.out.println(cnt);
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println("Execution took: " + (System.currentTimeMillis() - start));

    }
}
