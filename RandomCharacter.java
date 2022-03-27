import java.util.*;
import java.util.Random;

public class RandomCharacter{
    Random random = new Random();

    public char getRandomLowerCaseLetter(){
        return (char)('a' + random.nextInt(26));
    }

    public char getRandomUpperCaseLetter(){
        return (char)('A' + random.nextInt(26));
    }

    public int getRandomDigitCharacter(){
        return (int)(random.nextInt(10) + '0');
    }

    public char getRandomCharacter(){
        //Total ASCII characters = 256
        return (char)(random.nextInt(256) + '~');
    }

    public boolean Prime(int number){
        boolean isPrime = true;
        if (number >1){
            for(int i = 0; i<number/2; i++){
                //Remainder 0 != prime
                if(number%2==0){
                    isPrime = false;
                }
            }
        } else{
            isPrime = false;
        }
        return isPrime;
    }

    public int getRandomPrimeNumber(){
        //Limit to 10
        int number = (random.nextInt(10)+ '0');
        while(!Prime(number)){
            number = (random.nextInt(10)+'0');
        }
        return number;
    }

    public static void main(String[] args) {
        RandomCharacter randomChar = new RandomCharacter();

        //Print 15 times each
        for(int i=0; i<15; i++){
            System.out.println("Random Lower Case Letter: " + randomChar.getRandomLowerCaseLetter());
            System.out.println("Random Upper Case Letter: " + randomChar.getRandomUpperCaseLetter());
            System.out.println("Random Digit Character: " + randomChar.getRandomDigitCharacter());
            System.out.println("Random Character: " + randomChar.getRandomCharacter());
            System.out.println("Random Prime Number: " + randomChar.Prime(randomCharacter.getRandomPrimeNumber()));
        }
    }
}
