import org.junit.*;

public class TestArrayOnlyOneFour {

    @Test
    public void arrayFindFourTest1 () {
        int[] test = {1, 1, 1, 4, 4, 1, 4, 4};
        Assert.assertTrue(Main.arrayOnlyOneFour(test));
    }

    @Test
    public void arrayFindFourTest2 () {
        int[] test = {1, 1, 1, 1, 1, 1};
        Assert.assertFalse(Main.arrayOnlyOneFour(test));
    }

    @Test
    public void arrayFindFourTest3 () {
        int[] test = {4, 4, 4, 4};
        Assert.assertFalse(Main.arrayOnlyOneFour(test));
    }

    @Test
    public void arrayFindFourTest4 () {
        int[] test = {1, 4, 4, 1, 1, 4, 3};
        Assert.assertFalse(Main.arrayOnlyOneFour(test));
    }
}
