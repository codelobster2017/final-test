import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void averageValueArrayTest(){
        int[] array = new int[]{1, 2, 3};

        assertEquals(Calculator.averageValueArray(array), 2);
    }

    @Test
    void comparisonAverageValueTestLeftMoreRight(){
        int[] arrrayLeft = new int[]{ 10, 30, 40, 50};
        int[] arrrayRight = new int[]{ 1, 3, 4, 5};

        assertEquals(Calculator.comparisonAverageValueArray(arrrayLeft, arrrayRight), "Первый список имеет большее среднее значение");

    }

    @Test
    void comparisonAverageValueTestLeftLessRight(){

        int[] arrrayLeft = new int[]{ 1, 3, 4, 5};
        int[] arrrayRight = new int[]{ 10, 30, 40, 50};

        assertEquals(Calculator.comparisonAverageValueArray(arrrayLeft, arrrayRight), "Второй список имеет большее среднее значение");
    }

    @Test
    void comparisonAverageValueTestLeftEqualRight(){

        int[] arrrayLeft = new int[]{ 10, 30, 40, 50};
        int[] arrrayRight = new int[]{ 10, 30, 40, 50};

        assertEquals(Calculator.comparisonAverageValueArray(arrrayLeft, arrrayRight), "Средние значения равны");
    }


}
