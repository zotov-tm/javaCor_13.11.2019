package lesson2;


import sun.awt.SunHints;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        String[][] arrayOfStrings = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};

        try {
            checkArraySize(arrayOfStrings);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();

        }
    }


    public static void checkArraySize(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int arraySize = 4;
        int i;
        int d = 0;
        int summ = 0;


        for (i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                int a = Integer.parseInt(array[i][j]);

                summ += a;
            }

            if (array[i].length == arraySize) {
                d++;
            }

        }
        System.out.println(summ);


        if (array.length != arraySize || d != 4)
            throw new MyArraySizeException("Переданный массив должен быть размером 4х4");


    }


}





