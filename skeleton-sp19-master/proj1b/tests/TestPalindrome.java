import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }
    @Test
    public void testIsPalindrome(){
        assertFalse(palindrome.isPalindrome("cat"));
        assertFalse(palindrome.isPalindrome("mama"));
        assertFalse(palindrome.isPalindrome("xdddd"));
        assertTrue(palindrome.isPalindrome("noon"));
        assertTrue(palindrome.isPalindrome(""));
        assertTrue(palindrome.isPalindrome("racecar"));
        assertTrue(palindrome.isPalindrome("d"));

       try{
            assertTrue(palindrome.isPalindrome(null));
        }catch(NullPointerException e){
            assertEquals(NullPointerException.class, e.getClass());
        }
    }
    @Test
    public void isPalindromeDequeTest(){

        assertTrue(palindrome.isPalindromeDeque("racecar"));
        assertTrue(palindrome.isPalindromeDeque("x"));
        assertTrue(palindrome.isPalindromeDeque("noon"));
        assertFalse(palindrome.isPalindromeDeque("abcdefxedcba"));
        assertFalse(palindrome.isPalindromeDeque("eqweqeqweq"));
    }






}