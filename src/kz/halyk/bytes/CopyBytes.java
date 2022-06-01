package kz.halyk.bytes;

import java.io.*;

public class CopyBytes {
    public static void main(String[] args) throws IOException {


        PrintStream out1 = System.out;
        PrintStream err = System.err;

        FileInputStream in = null;
        FileOutputStream out = null;

        try {

            in = new FileInputStream("src/kz/halyk/bytes/xanadu.txt");
            out = new FileOutputStream("src/kz/halyk/bytes/outagain.txt");
            int c;


            System.out.println("Bytes ib file: " + in.available());

            byte []b = new byte[300];
            in.read(b);

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
