package main.tests;

import main.java.TwoSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TwoSumTest {

    TwoSum twoSum;

    @BeforeEach
    public void init() {
        twoSum = new TwoSum();
    }

    @Test
    @DisplayName("Resultant arrays are equal")
    public void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] res = twoSum.twoSumFunc(nums, target);
        Assertions.assertTrue(Arrays.equals(res, new int[]{0, 1}));
    }
}
