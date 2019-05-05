import org.junit.Test;

import static org.junit.Assert.*;

public class Discussion5Test {

    @Test
    public void flatten() {
        int[][] input={{1,2,3},{},{7,8}};
        int [] expected={1,2,3,7,8};
        assertArrayEquals(expected, Discussion5.flatten(input));


        int[][] input1={{1,2,3},{},{7,8},{10,12,14,15},{},{20,1}};
        int [] expected1={1,2,3,7,8,10,12,14,15,20,1};
        assertArrayEquals(expected1, Discussion5.flatten(input1));
    }
}