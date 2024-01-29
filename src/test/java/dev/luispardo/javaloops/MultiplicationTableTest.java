package dev.luispardo.javaloops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MultiplicationTableTest {

    @Test
    public void testMultiplicationTable() {
        int n = 7;
        int[] expected = {7, 14, 21, 28, 35, 42, 49, 56, 63, 70};
        assertArrayEquals(expected, generateMultiplicationTableArray(n));
    }

    private int[] generateMultiplicationTableArray(int n) {
        int[] result = new int[10];
        for (int i = 1; i <= 10; i++) {
            result[i - 1] = n * i;
        }
        return result;
    }
}
