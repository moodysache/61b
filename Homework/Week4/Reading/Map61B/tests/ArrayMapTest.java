import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayMapTest {
    private static ArrayMap<String,Integer> test=new ArrayMap<>();
    @Test
    public void sizeTest(){
        test.put("Animal", 3);
        test.put("Dog", 5);
        test.put("Cat", 1);
        test.put("Fox", 4);
        test.put("Cat", 1);
        assertEquals(4, test.size());
    }

    @Test
    public void getTest(){
        ArrayMap<Integer,Integer> test=new ArrayMap<>();
        test.put(5, 2);
        test.put(3, 100);
        int expected=100;
        assertEquals((Integer)expected,test.get(3));
    }

    @Test
    public void testGetKeys(){
        test.put("Animal", 3);
        test.put("Dog", 5);
        test.put("Cat", 1);
        test.put("Fox", 4);
        test.put("Fox", 1);
       List<String> list =new ArrayList<>();
        list.add("Animal");
        list.add("Dog");
        list.add("Cat");
        list.add("Fox");
        assertEquals(list,test.keys());
    }
}