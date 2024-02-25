package org.example;

public class Calculator {
    public static String comparisonAverageValueArray(int[] arrayLeft, int[] arrayRight){

        if(averageValueArray(arrayLeft) > averageValueArray((arrayRight))){

            return "Первый список имеет большее среднее значение";

        } else if (averageValueArray(arrayLeft) < averageValueArray((arrayRight))) {

            return "Второй список имеет большее среднее значение";

        }else {

            return "Средние значения равны";

        }
    }

    public static int averageValueArray(int[] array){
        float summ = 0;

        for (float value : array) {
            summ += value;
        }
        return Math.round(summ/array.length);    }
}
