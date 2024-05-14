import java.util.Scanner;
/**
 * Word Guessing Game
 * 
 * This is a program in which a user is attempting to guess a random word. The computer will 
 *      give feedback on the user's guess regarding word lenght, alphabetical order, and 
 *      correct amount of first letters.
 * @author Nadeen Findakly
 * @version May 12, 2022
 */
public class WordGuessFinN 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    final String MYSTERY_WORD = "hoggin";
    final int WORD_LENGTH = 6;
    String wordGuess;
    String wordPosition;
    int guessCounter = 1;
    int wordAlphabeticalPosition;
    int guessedWordLength;
    int hPosition;
    int oPosition;
    int gPosition;
    int g2Position;
    int iPosition;
    int nPosition;
    int firstLetters;
    
    System.out.println ("The computer has a word for you to guess.");
    do 
    {
      System.out.println ("\nGuess the computers word: ");
      wordGuess = input.nextLine ();
      wordAlphabeticalPosition = MYSTERY_WORD.compareTo(wordGuess.toLowerCase());
      guessedWordLength = wordGuess.length ();
      if (guessCounter == 1 && guessedWordLength == 6 && !wordGuess.equalsIgnoreCase(MYSTERY_WORD))
      {
        System.out.println ("The computer's word has six letters, but it is not these ones, try again");
      }
      else if (guessCounter == 1 && !wordGuess.equalsIgnoreCase(MYSTERY_WORD))
      {
        System.out.println ("The word the computer picked is only " + WORD_LENGTH + " letters in length, try again");
      }
      else 
      {
        if (wordAlphabeticalPosition > 0)
        {
          wordPosition = "AFTER";
        }
        else if (wordAlphabeticalPosition < 0)
        {
          wordPosition = "BEFORE";
        }
        else
        {
          continue;
        }
        hPosition = wordGuess.toLowerCase().indexOf ("h");
        oPosition = wordGuess.toLowerCase().indexOf ("o");
        gPosition = wordGuess.toLowerCase().indexOf ("g");
        g2Position = wordGuess.toLowerCase().lastIndexOf ("g");
        iPosition = wordGuess.toLowerCase().indexOf ("i");
        nPosition = wordGuess.toLowerCase().indexOf ("n");
        if (hPosition == 0 && oPosition == 1 && gPosition == 2 && g2Position == 3 && iPosition == 4)
        {
          firstLetters = 5;
        }
        else if (hPosition == 0 && oPosition == 1 && gPosition == 2 && g2Position == 3)
        {
          firstLetters = 4;
        }
        else if (hPosition == 0 && oPosition == 1 && gPosition == 2)
        {
          firstLetters = 3;
        }
        else if (hPosition == 0 && oPosition == 1)
        {
          firstLetters = 2;
        }
        else if (hPosition == 0)
        {
          firstLetters = 1;
        }
        else
        {
          firstLetters = 0;
        }
        System.out.println ("Computer's word comes " + wordPosition + " the (" + wordGuess + ") word in the dictionary");
        System.out.println ("There are " + firstLetters + " first letter(s) that are correct");
        System.out.println ("The alphabet for reference: abcdefghijklmnopqrstuvwxyz");
      }
      guessCounter ++;
    } while (!wordGuess.equalsIgnoreCase(MYSTERY_WORD));
    
    System.out.println ("\nCongratulations");
    System.out.println ("You guessed the word in " + guessCounter + " guesses!");
    System.out.println ("\nHOGGIN: a compactable groundcover that is composed of a mixture of clay, gravel, " + 
                        "\nand sand or granite dust that produces a buff-coloured bound surface.");
  }
}
