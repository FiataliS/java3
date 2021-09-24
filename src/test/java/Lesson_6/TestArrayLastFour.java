package Lesson_6;

import lesson_6.ArrayLastFour;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestArrayLastFour {

    ArrayLastFour arrayLastFour;

    @Before
    public void init() {
        System.out.println("init");
        arrayLastFour = new ArrayLastFour();
    }

    @Test
    public void test1(){
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr2 = {5,6,7};
        Assert.assertArrayEquals(arr2, arrayLastFour.vs(arr));
    }

    @Test(expected = RuntimeException.class)
    public void test2() {
        int[] arr = {1,2,3,5,5,6,7};
        arrayLastFour.vs(arr);
    }

    @Test
    public void test3(){
        int[] arr = {1,2,3,4,4,4,4};
        int[] arr2 = {};
        Assert.assertArrayEquals(arr2, ArrayLastFour.vs(arr));
    }
}
