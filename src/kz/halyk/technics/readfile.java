package kz.halyk.technics;

import java.io.*;

public class readfile {
    public static void main(String args[]) {

        try {
            int len = (int) (new File("onemb.txt").length());
            FileInputStream fis = new FileInputStream("onemb.txt");
            byte buf[] = new byte[len];
            fis.read(buf);
            fis.close();
            int cnt = 0;
            for (int i = 0; i < len; i++) {
                if (buf[i] == '\n') cnt++;
            }
            System.out.println(cnt);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}