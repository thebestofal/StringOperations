import org.junit.jupiter.api.Assertions;
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
    public void reverse_StringWithSpecialSignPassed_ReturnReverse()
    {
        String s = "1@lppa^";
        assertEquals(so.reverse(s), "^appl@1");
    }
    
    @Test
    public void reverse_NullString_ThrowsException()
    {
        Assertions.assertThrows(NullPointerException.class, () -> {
            so.reverse(null);
        });
    }
    
    @Test
    public void concat_TwoStringsPassed_ReturnConcatenated()
    {
        String h = "Hello";
        String w = " world";
        assertEquals(so.concat(h,w), "Hello world");
    }
    
    @Test
    public void concat_FirstStringisNull_ReturnSecondString()
    {
        String h = null;
        String w = "world";
        assertNull(so.concat(h, w));
    }
    
    @Test
    public void concat_SecondStringisNull_ReturnSecondString()
    {
        String h = "Hello";
        String w = null;
        assertEquals(so.concat(h,w), "Hello");
    }
    
    @Test
    public void concat_FirstStringEmpty_ReturnNull()
    {
        String h = "";
        String w = "world";
        assertEquals(so.concat(h,w), null);
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
    public void isPalindrome_4CharsStringEven_ReturnTrue()
    {
        String palindrom = "abba";
        assertTrue(so.isPalindrome(palindrom));
    }
    
    @Test
    public void isPalindrome_LongStringEven_ReturnTrue()
    {
        String palindrom = "abccba";
        assertTrue(so.isPalindrome(palindrom));
    }
    
    @Test
    public void isPalindrome_3CharsStringOdd_ReturnTrue()
    {
        String palindrom = "aba";
        assertTrue(so.isPalindrome(palindrom));
    }
    
    @Test
    public void isPalindrome_NotPalindormeString_ReturnFalse()
    {
        String s = "marek";
        assertFalse(so.isPalindrome(s));
    }
    
    @Test
    public void isPalindrome_Number_ReturnTrue()
    {
        String s = "123321";
        assertTrue(so.isPalindrome(s));
    }
    
    @Test
    public void isPalindrome_NullString_ThrowsException()
    {
        Assertions.assertThrows(NullPointerException.class, () -> {
            so.isPalindrome(null);
        });
    }
    
}