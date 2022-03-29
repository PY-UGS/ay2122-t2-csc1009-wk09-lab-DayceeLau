import java.util.*;
import java.util.Random;

public class RandomCharacter{
    Random random = new Random();   //Create random object

    public char getRandomLowerCaseLetter(){
        return (char)('a' + random.nextInt(26));    //lowercase, 26 alphabets 
    }

    public char getRandomUpperCaseLetter(){
        return (char)('A' + random.nextInt(26));    //uppercase, 26 alphabets 
    }

    public char getRandomDigitCharacter(){
        return (char)(random.nextInt(10) + '0');     //integer from 0 to 9
    }

    public char getRandomCharacter(){
        return (char)(random.nextInt(256) + '~');  //Total ASCII characters = 256
    }

    public boolean Prime(char number){
        boolean isPrime = true;
        int actualNum = Character.getNumericValue(number);         //Get number only    
        if (actualNum > 1){    //If number more than 1
            for(int i = 2; i<=actualNum/2; i++){
                if(actualNum % i == 0){                   //Remainder 0 != prime
                    isPrime = false;
                    break;              
                }
            }                  
        }
        else { isPrime = false; }
        return isPrime;
    }


    public static void main(String[] args) {
        Wk09RandomCharacter randomChar = new Wk09RandomCharacter();
        //Print 15 times each
        char digits;
        for(int i=0; i<15; i++){
            System.out.println("Random Lower Case Letter: " + randomChar.getRandomLowerCaseLetter());
            System.out.println("Random Upper Case Letter: " + randomChar.getRandomUpperCaseLetter());
            digits = randomChar.getRandomDigitCharacter();
            System.out.println("Random Digit Character: " + digits);
            System.out.println("Random Character: " + randomChar.getRandomCharacter());
            System.out.println("Random Number: " + digits + "\nPrime: " + randomChar.Prime(digits));
            System.out.println();

        }
    }
}
