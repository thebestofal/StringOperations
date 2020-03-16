import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringOperationsTest
{
    StringOperations so = new StringOperations();
    @Test
    public void reverse_StringPassed_ReturnReverse()
    {
        String s = "Hello";
        assertEquals(so.reverse(s), "olleH");
    }
    
    @Test
    public void reverse_CharPassed_ReturnSameChar()
    {
        String s = "A";
        assertEquals(so.reverse(s), "A");
    }
    
    @Test
    public void concat_TwoStringsPassed_ReturnConcatenated()
    {
        String h = "Hello";
        String w = " world";
        assertEquals(so.concat(h,w), "Hello world");
    }
    
    @Test
    public void isPalindrome_SingleChar_ReturnTrue()
    {
        String palindrom = "a";
        assertTrue(so.isPalindrome(palindrom));
    }
    
    @Test
    public void isPalindrome_TwoSameChars_ReturnTrue()
    {
        String palindrom = "aa";
        assertTrue(so.isPalindrome(palindrom));
    }
    
    @Test
    public void isPalindrome_LongStringEven_ReturnTrue()
    {
        String palindrom = "abccba";
        assertTrue(so.isPalindrome(palindrom));
    }
    
    @Test
    public void isPalindrome_LongStringOdd_ReturnTrue()
    {
        String palindrom = "abcba";
        assertTrue(so.isPalindrome(palindrom));
    }
}