package lesson_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

import static java.lang.System.in;
public class sewTenIntoOne {


        FileOutputStream out = null;
        public sewTenIntoOne(ArrayList<FileInputStream> inputStreams) {

            try {
                out = new FileOutputStream("out.txt");
                for (FileInputStream in : inputStreams){
                    byte[] content = new byte[in.available()];
                    in.read(content);
                    out.write(content);
                    out.write('\r');
                    out.write('\n');
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }




}
