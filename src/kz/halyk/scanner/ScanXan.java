package kz.halyk.scanner;

import java.io.*;
import java.util.Scanner;

public class ScanXan {
    public static void main(String[] args) throws IOException {

        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } finally {

            // сканер тоже нужно закрыть. Хотя сканер сам не поток,
            // он закрывает поток, который использует (underlying stream)
            if (s != null) {
                s.close();
            }
        }
    }
}
