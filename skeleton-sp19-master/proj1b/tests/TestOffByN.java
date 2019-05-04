import org.junit.Test;
import static org.junit.Assert.*;
public class TestOffByN {
    static Palindrome palindrome =new Palindrome();

    @Test
    public void testIsPalindromeOffByN(){
        assertTrue(palindrome.isPalindromeDequeOffByOne("racecar", new OffByN(0)));
        assertTrue(palindrome.isPalindromeDequeOffByOne("abcfed", new OffByN(3)));
        assertTrue(palindrome.isPalindromeDequeOffByOne("1298", new OffByN(7)));
        assertTrue(palindrome.isPalindromeDequeOffByOne("abk", new OffByN(10)));
        assertFalse(palindrome.isPalindromeDequeOffByOne("eqeqeqwe", new OffByN(10)));
        assertTrue(palindrome.isPalindromeDequeOffByOne("gbh", new OffByN(1)));

    }
    @Test
    public void testIsPalindromeDequeOffByN(){
        assertTrue(palindrome.isPalindromeDequeOffByOne("racecar", new OffByN(0)));
        assertTrue(palindrome.isPalindromeDequeOffByOne("abcfed", new OffByN(3)));
        assertTrue(palindrome.isPalindromeDequeOffByOne("1298", new OffByN(7)));
        assertTrue(palindrome.isPalindromeDequeOffByOne("abk", new OffByN(10)));
        assertFalse(palindrome.isPalindromeDequeOffByOne("eqeqeqwe", new OffByN(10)));
        assertTrue(palindrome.isPalindromeDequeOffByOne("gbh", new OffByN(1)));

    }

}
