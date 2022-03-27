import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;

public class RandomCharacterTest {
    RandomCharacter randomChar;
    @BeforeEach
    @Test
    void setup(){
        randomChar = new RandomCharacter();     //Create RandomCharacter object
        assertTrue(randomChar instanceof RandomCharacter);      //Check if object is instance of RandomCharacter
    }

    @RepeatedTest(15)
    //Check if lowercase
    void getRandomLowerCaseLetterTest(){
        assertTrue(Character.isLowerCase(randomChar.getRandomLowerCaseLetter()));   
        assertFalse(Character.isUpperCase(randomChar.getRandomLowerCaseLetter()));  
    }

    @RepeatedTest(15)
    //Check if upppercase
    void getRandomUpperCaseLetterTest(){
        assertTrue(Character.isUpperCase(randomChar.getRandomUpperCaseLetter()));
        assertFalse(Character.isLowerCase(randomChar.getRandomUpperCaseLetter()));
    }

    @RepeatedTest(15)
    //Check digit character
    void getRandomDigitCharacterTest(){
        assertTrue(Character.isDigit(randomChar.getRandomDigitCharacter()));
        assertFalse(Character.isUpperCase(randomChar.getRandomDigitCharacter()));
        assertFalse(Character.isLowerCase(randomChar.getRandomDigitCharacter()));
        assertFalse(Character.isLetter(randomChar.getRandomDigitCharacter()));
    }

    @RepeatedTest(15)
    //Check number of random character
    void getRandomCharacterTest(){
        assertTrue(randomChar.getRandomUpperCaseLetter() <=256);
        assertFalse(randomChar.getRandomUpperCaseLetter() >256);
    }

    @RepeatedTest(15)
    //Check for prime number
    void getRandomPrimeNumberTest(){
        int number = randomChar.getRandomPrimeNumber();
        assertTrue(randomChar.Prime(number));
    }
}
