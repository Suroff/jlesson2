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
    public static String[][] GetArr(int i, int j){
        String MArr[][];
        MArr = new String[i][j];
        Scanner Scn = new Scanner(System.in);
        for (int h = 0; h < i; h++){
            for (int w = 0; w < j; w++){
                System.out.println("Введите элемент массива");
                MArr[h][w] = Scn.nextLine();
            }
        }

        System.out.println("Массив создан");
        System.out.println("**************");

        for (String[] row : MArr){
            printRow(row);
        }
        return MArr;
    }

    //Метод для суммирования элементов
    public static void SummArr() {
        int Summ = 0;
        String Ych = "";
        String StArr[][];
        StArr = GetArr(4,4);
        if (StArr.length !=4) throw new MySizeArrayException ("Неверный размер массива");
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
//        String MyStrArray[][];

//        GetArr(MyStrArray,4,4);
        SummArr();

    }
}
