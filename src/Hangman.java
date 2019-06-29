import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {


        //Initializes word array list
        ArrayList<String> wordArray = new ArrayList<>();
        List<String> guessingWord = Arrays.asList
                ("tree", "rain", "bear", "encourage", "promise", "soup",
                        "chess", "insurance", "pancakes", "stream");

        wordArray.addAll(guessingWord);

        Scanner key = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain;

        //choosing a random word for user to guess
        int wordIndex = rand.nextInt((10));
        String theWord = (wordArray.get(wordIndex));
        System.out.println(wordArray.get(wordIndex));
        System.out.println(wordIndex);
        System.out.println("Would you like to play hangman??\n " + "Of course you do! Let's get started!!\n");

        do {
            System.out.println("You have six guesses.");
            System.out.print("Here is the word I am thinking of: ");
            ArrayList<String> replaceWords = new ArrayList<>(wordArray.size());

            for (int i = 0; i < theWord.length(); i++) {
                replaceWords.add("_");
            }
            int i2 = 0;
            for (String var : replaceWords) {
                System.out.print(replaceWords.get(i2) + " ");
                i2++;
            }
            //allowing user to guess the words
            String guessedCharacter;
            for (int numOfGuesses = 0; numOfGuesses < 6; numOfGuesses++) {
                System.out.print("\nEnter your guess: ");
                guessedCharacter = key.next();

                for (int i = 0; i < theWord.length(); i++) {          //This for loop
                    System.out.println(theWord.charAt(i));
                    String character = (theWord.substring(i, (i + 1)));
                    System.out.println(character);
                    if (character.equalsIgnoreCase(guessedCharacter)) {
                        replaceWords.add(i, guessedCharacter);
                        System.out.println("Here");
                    } else
                        break;
                    System.out.println(replaceWords);
                }


            }
            System.out.println(replaceWords);


            playAgain = false;
        } while (playAgain);


    }
}

