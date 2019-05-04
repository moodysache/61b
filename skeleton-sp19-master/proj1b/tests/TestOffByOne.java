import org.junit.Test;

import static org.junit.Assert.*;

public class TestOffByOne {
    // You must use this CharacterComparator and not instantiate
    // new ones, or the autograder might be upset.
    static CharacterComparator offByOne = new OffByOne();
    static Palindrome palindrome = new Palindrome();

    @Test
    public void testEqualChars() {

        assertTrue(offByOne.equalChars('a', 'b'));
        assertTrue(offByOne.equalChars('c', 'd'));
        assertFalse(offByOne.equalChars('x', 'z'));
    }

    @Test
    public void testIsPalindromeOffByOne() {
        assertFalse(palindrome.isPalindromeOffByOne("racecar", offByOne));
        assertFalse(palindrome.isPalindromeOffByOne("qweqweqwe", offByOne));
        assertTrue(palindrome.isPalindromeOffByOne("aceghfdb", offByOne));
        assertTrue(palindrome.isPalindromeOffByOne("abb", offByOne));
        assertTrue(palindrome.isPalindromeOffByOne("a", offByOne));

    }

    @Test
    public void testIsPalindromeDequeOffByOne() {
        assertFalse(palindrome.isPalindromeDequeOffByOne("racecar", offByOne));
        assertFalse(palindrome.isPalindromeDequeOffByOne("qweqweqwe", offByOne));
        assertTrue(palindrome.isPalindromeDequeOffByOne("aceghfdb", offByOne));
        assertTrue(palindrome.isPalindromeDequeOffByOne("abb", offByOne));
        assertTrue(palindrome.isPalindromeDequeOffByOne("a", offByOne));
    }
}

