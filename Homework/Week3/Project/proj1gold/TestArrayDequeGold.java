import static org.junit.Assert.*;
import org.junit.Test;

public class TestArrayDequeGold {
    private static StudentArrayDeque<Integer> student = new StudentArrayDeque();
    private static ArrayDequeSolution<Integer> array = new ArrayDequeSolution();

    @Test
    public void testStudentArrayDeque() {

        for (int i = 0; i < 10; i += 1) {
            double numberBetweenZeroAndOne = StdRandom.uniform();

            if (numberBetweenZeroAndOne < 0.5) {
                student.addLast(i);
                array.addLast(i);
            } else {
                student.addFirst(i);
                array.addFirst(i);
            }
        }
            for (int j = 0; j < 10; j += 1) {
                Integer x = student.removeLast();
                Integer y = array.removeLast();
                assertEquals("noo, check Addfirst,removeFirst and AddLast",y, x);
            }

        }
    }

