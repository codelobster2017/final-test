package org.example;

public class Calculator {
    public static String comparisonAverageValueArray(float[] arrayLeft, float[] arrayRight){

        if(averageValueArray(arrayLeft) > averageValueArray((arrayRight))){

            return "Первый список имеет большее среднее значение";

        } else if (averageValueArray(arrayLeft) < averageValueArray((arrayRight))) {

            return "Второй список имеет большее среднее значение";

        }else {

            return "Средние значения равны";

        }
    }

    public static float averageValueArray(float[] array){
        float summ = 0;

        for (float value : array) {
            summ += value;
        }
        return summ/array.length;
    }
}
