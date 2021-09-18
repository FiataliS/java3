package lesson_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


    public class Main {

        public static void main(String[] args) {

//      1. Прочитать файл(около 50 байт) в байтовый массив и вывести этот массив в консоль;
            readArr ex1 = new readArr();

//      2. Последовательно сшить 5 файлов в один (файлы примерно 100 байт). Может пригодиться
//      следующая конструкция: ArrayList<InputStream> al = new ArrayList<>(); ... Enumeration<InputStream> e = Collections.enumeration(al);
            ArrayList<FileInputStream> arrayList = new ArrayList<>();
            for (int i = 1; i < 6; i++) {
                try {
                    FileInputStream in = new FileInputStream(i + ".txt");
                    arrayList.add(in);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            sewTenIntoOne ex2 = new sewTenIntoOne(arrayList);

//    3. Написать консольное приложение, которое умеет постранично читать текстовые файлы (размером > 10 mb).
//    Вводим страницу (за страницу можно принять 1800 символов), программа выводит ее в консоль.
//    Контролируем время выполнения: программа не должна загружаться дольше 10 секунд, а чтение – занимать свыше 5 секунд.
            readText ex3 = new readText("12345.txt");

        }
    }