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

    public int getRandomDigitCharacter(){
        return (int)(random.nextInt(9) + '0');     //integer from 0 to 9
    }

    public char getRandomCharacter(){
        return (char)(random.nextInt(256) + '~');  //Total ASCII characters = 256
    }

    public boolean Prime(int number){
        boolean isPrime = true;                    // set to true
        if (number >1){                            //If number more than 1
            for(int i = 0; i<number/2; i++){ 
                if(number%2==0){                   //Remainder 0 != prime
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
