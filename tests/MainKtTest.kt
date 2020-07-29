import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun SingleCaseOneString() {
        assertEquals(true, checkPalindrome("MUM"))
    }

    @Test
    fun mixedCasesOneString(){
        assertEquals(true, checkPalindrome("MadAm"))
    }

    @Test
    fun setenceString(){
        assertEquals(true, checkPalindrome("eye for of eye"))
    }

    @Test
    fun setenceWithCharacters(){
        assertEquals(true, checkPalindrome("Madam, I'm Adam."))
    }

    @Test
    fun oneCharacterString(){
        assertEquals(true, checkPalindrome("A"))
    }

    @Test
    fun emptyString(){
        assertEquals(true, checkPalindrome(""))
    }

    @Test
    fun notAPalindrome(){
        assertEquals(false, checkPalindrome("1110rurp"))
    }

    @Test
    fun emptySpace(){
        assertEquals(true, checkPalindrome(" "))
    }



}