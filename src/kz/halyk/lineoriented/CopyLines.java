package kz.halyk.lineoriented;

import java.io.*;

public class CopyLines {
    public static void main(String[] args) {


        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader("xanadu.txt"));
            outputStream = new PrintWriter(new FileWriter("outtagain.txt"));
            String line = null;
            while ((line = inputStream.readLine()) != null) {
                outputStream.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null)
                outputStream.close();
        }


    }
}
