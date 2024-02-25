import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void averageValueArrayTest(){
        float[] array = new float[]{1, 2, 3};

        assertEquals(Calculator.averageValueArray(array), 2);
    }

    @Test
    void comparisonAverageValueTestLeftMoreRight(){
        float[] arrrayLeft = new float[]{ 10, 30, 40, 50};
        float[] arrrayRight = new float[]{ 1, 3, 4, 5};

        assertEquals(Calculator.comparisonAverageValueArray(arrrayLeft, arrrayRight), "Первый список имеет большее среднее значение");

    }

    @Test
    void comparisonAverageValueTestLeftLessRight(){

        float[] arrrayLeft = new float[]{ 1, 3, 4, 5};
        float[] arrrayRight = new float[]{ 10, 30, 40, 50};

        assertEquals(Calculator.comparisonAverageValueArray(arrrayLeft, arrrayRight), "Второй список имеет большее среднее значение");
    }

    @Test
    void comparisonAverageValueTestLeftEqualRight(){

        float[] arrrayLeft = new float[]{ 10, 30, 40, 50};
        float[] arrrayRight = new float[]{ 10, 30, 40, 50};

        assertEquals(Calculator.comparisonAverageValueArray(arrrayLeft, arrrayRight), "Средние значения равны");
    }


}
