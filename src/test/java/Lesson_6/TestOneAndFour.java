package Lesson_6;

import lesson_6.ArrayLastFour;
import lesson_6.SearchOneAndFour;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestOneAndFour {

    SearchOneAndFour searchOneAndFour;

    @Before
    public void init() {
        System.out.println("init");
        searchOneAndFour = new SearchOneAndFour();
    }

    @Test
    public void test1(){
        int[] arr = {1,2,3,4,5,6,7};
        Assert.assertTrue(searchOneAndFour.search(arr));
    }

    @Test
    public void test2(){
        int[] arr = {3,2,3,7,5,6,7};
        Assert.assertFalse(searchOneAndFour.search(arr));
    }

    @Test
    public void test3(){
        int[] arr = {};
        Assert.assertFalse(searchOneAndFour.search(arr));
    }
}
