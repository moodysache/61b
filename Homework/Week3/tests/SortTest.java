import static org.junit.Assert.*;
import org.junit.Test;

public class SortTest {
    @Test
    public void testSort1() {
        int[] input =       {6, 3, 7, 2, 8, 1};
        int[] expected =    {1, 2, 3, 6, 7, 8};
        Sort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSort2() {
        int[] input = {6, 3, 7, 2, 8, 1, 100, 2345, 231, 0, -1, 3, 4, 5, 6, -5, 100000};
        int[] expected = {-5, -1, 0, 1, 2, 3, 3, 4, 5, 6, 6, 7, 8, 100, 231, 2345, 100000};
        Sort.sort(input);
        assertArrayEquals(expected, input);
    }

}