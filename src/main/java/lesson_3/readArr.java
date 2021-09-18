package lesson_3;


import java.io.*;
import java.util.Arrays;

public class readArr {


    FileInputStream in = null;
    int i;
    readArr() {

        try {
            in = new FileInputStream("12345.txt");
            byte[] bw = new byte[in.available()];
            in.read(bw);

            System.out.println(new String(bw, "UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}