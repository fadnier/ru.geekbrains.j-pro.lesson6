import org.junit.*;

public class TestArrayFindFour {

    @Test
    public void arrayFindFourTest1 () {
        int[] test = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] success = {1,7};
        Assert.assertArrayEquals(Main.arrayFindFour(test),success);
    }

    @Test
    public void arrayFindFourTest2 () {
        int[] test = {4, 2, 2, 2, 2, 3, 3, 1, 7};
        int[] success = {2, 2, 2, 2, 3, 3, 1, 7};
        Assert.assertArrayEquals(Main.arrayFindFour(test),success);
    }

    @Test(expected = RuntimeException.class)
    public void arrayFindFourTest3 () {
        int[] test = {1, 2, 3, 6, 2, 3, 2, 1, 7};
        Main.arrayFindFour(test);
    }
}
