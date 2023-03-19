package arrays.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindTargetIndicesAfterSortingArrayTest {

    @Test
    public void testOne() {
        ArrayList<Integer> inputArrayList =  FindTargetIndicesAfterSortingArray.targetIndices(new int[] {1,2,5,2,3}, 2);
        ArrayList<Integer> outputArrayList = new ArrayList<>(Arrays.asList(1,2));
        assertEquals(outputArrayList, inputArrayList);
    }

    @Test
    public void testTwo() {
        ArrayList<Integer> inputArrayList =  FindTargetIndicesAfterSortingArray.targetIndices(new int[] {1,2,5,2,3}, 3);
        ArrayList<Integer> outputArrayList = new ArrayList<>(Arrays.asList(3));
        assertEquals(outputArrayList, inputArrayList);
    }

    @Test
    public void testThree() {
        ArrayList<Integer> inputArrayList =  FindTargetIndicesAfterSortingArray.targetIndices(new int[] {1,2,5,2,3}, 5);
        ArrayList<Integer> outputArrayList = new ArrayList<>(Arrays.asList(4));
        assertEquals(outputArrayList, inputArrayList);
    }



}