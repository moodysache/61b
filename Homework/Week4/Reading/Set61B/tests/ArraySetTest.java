import static org.junit.Assert.*;
import org.junit.Test;
public class ArraySetTest {

    @Test
    public void sizeTest(){
        Set<Integer> x=new ArraySet<>();
        x.add(20);
        x.add(40);
        x.add(20);
        x.add(40);
        assertEquals(x.size(),2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void nullTest(){
        Set<String> s=new ArraySet<>();
        s.add(null);
        s.add("horse");
        s.add("fish");
        s.add("house");
        s.add("fish");


    }
    @Test
    public void iteratorLoopTest(){
        Set<String> s=new ArraySet<>();

        s.add("horse");
        s.add("fish");
        s.add("house");
        s.add("fish");

        for(String j:s){
            System.out.println(j);
        }
    }

}