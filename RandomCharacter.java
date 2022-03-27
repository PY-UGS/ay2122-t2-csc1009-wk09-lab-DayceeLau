import java.util.*;
import java.util.Random;

public class Wk09RandomCharacter{
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
        Wk09RandomCharacter randomCharacter = new Wk09RandomCharacter();

        //Print 15 times each
        for(int i=0; i<15; i++){
            System.out.println("Random Lower Case Letter: " + randomCharacter.getRandomLowerCaseLetter());
            System.out.println("Random Upper Case Letter: " + randomCharacter.getRandomUpperCaseLetter());
            System.out.println("Random Digit Character: " + randomCharacter.getRandomDigitCharacter());
            System.out.println("Random Character: " + randomCharacter.getRandomCharacter());
            System.out.println("Random Prime Number: " + randomCharacter.Prime(randomCharacter.getRandomPrimeNumber()));
        }
    }
}