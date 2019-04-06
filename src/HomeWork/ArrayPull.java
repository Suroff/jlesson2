package HomeWork;

import HomeWork.Exeption.MyArrayDataException;
import HomeWork.Exeption.MySizeArrayException;

import java.util.Scanner;


public class ArrayPull {

//Метод табличного вывода массива

    public static void printRow(String[] row){
        for (String i : row){
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }


//Метод заполнения массива
    public static void GetArr(String[][] Arr, int i, int j){
        Scanner Scn = new Scanner(System.in);
        if (i < 4 || i > 4 || j < 4 || j > 4) throw new MySizeArrayException("Размер массива превышен");
        for (int h = 0; h < i; h++){
            for (int w = 0; w < j; w++){
                System.out.println("Введите элемент массива");
                Arr[h][w] = Scn.nextLine();
            }
        }

        System.out.println("Массив создан");
        System.out.println("**************");

        for (String[] row : Arr){
            printRow(row);
        }
    }

    //Метод для суммирования элементов
    public static void SummArr(String[][] StArr) {
        int Summ = 0;
        String Ych = "";

        try {

            for (int h = 0; h < StArr.length; h++){
                for (int w = 0; w < StArr[h].length; w++) {
                    Ych = " Колонка " + (w + 1)  +  " Строка " + (h + 1);
                    Summ = Summ + Integer.valueOf(StArr[h][w]);

                }
            }
        } catch (NumberFormatException ex){
            throw new MyArrayDataException("Не удалось преобразовать ячейку" + Ych);
        }
        System.out.println("Сумма элементов массива = " + Summ);
    }

    //Главный метод

    public static void main(String[] args){
        String MyStrArray[][];
        MyStrArray = new String[4][4];
        GetArr(MyStrArray,4,4);
        SummArr(MyStrArray);

    }
}
