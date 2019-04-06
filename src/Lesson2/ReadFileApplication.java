package Lesson2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileApplication {

    private static Scanner openFile(String name){
        try {
            FileReader fileReader = new FileReader(name);
            return new Scanner(fileReader);
        } catch (FileNotFoundException ex){
            throw new IllegalArgumentException(ex);
        } finally {
            System.out.println("Конец");
        }

    }

    public static void main(String[] args){

            Scanner scanner = openFile("D:\\@@JAVA\\reat.txt");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }


