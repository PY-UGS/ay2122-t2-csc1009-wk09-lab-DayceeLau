import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;

public class Wk09RandomCharacterTest {
    Wk09RandomCharacter randomCharacter;
    @BeforeEach
    @Test
    void setup(){
        randomCharacter = new Wk09RandomCharacter();
        assertTrue(randomCharacter instanceof Wk09RandomCharacter);
    }

    @RepeatedTest(15)
    void getRandomLowerCaseLetterTest(){
        assertTrue(Character.isLowerCase(randomCharacter.getRandomLowerCaseLetter()));
        assertFalse(Character.isUpperCase(randomCharacter.getRandomLowerCaseLetter()));
    }

    @RepeatedTest(15)
    void getRandomUpperCaseLetterTest(){
        assertTrue(Character.isUpperCase(randomCharacter.getRandomUpperCaseLetter()));
        assertFalse(Character.isLowerCase(randomCharacter.getRandomUpperCaseLetter()));
    }

    @RepeatedTest(15)
    void getRandomDigitCharacterTest(){
        assertTrue(Character.isDigit(randomCharacter.getRandomDigitCharacter()));
        assertFalse(Character.isUpperCase(randomCharacter.getRandomDigitCharacter()));
        assertFalse(Character.isLowerCase(randomCharacter.getRandomDigitCharacter()));
        assertFalse(Character.isLetter(randomCharacter.getRandomDigitCharacter()));
    }

    @RepeatedTest(15)
    void getRandomCharacterTest(){
        assertTrue(randomCharacter.getRandomUpperCaseLetter() <=256);
        assertFalse(randomCharacter.getRandomUpperCaseLetter() >256);
    }

    @RepeatedTest(15)
    void getRandomPrimeNumberTest(){
        int number = randomCharacter.getRandomPrimeNumber();
        assertTrue(randomCharacter.Prime(number));
    }
}
