package Hangman;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.util.*;
import java.io.*;

import static Hangman.drawHangMan.displayHangman;

public class Words {
    private static int wrongGuesses = 0;
    
     //getter to see how many wrong guesses the user has made

    public static int getWrongGuesses() {
        return wrongGuesses;
    }
    
    //This the the method to choose your diificulty: 1 for easy 2 for medium: 3 for hard:
    //This will return an ArrayList of strings from the text file that the user chose
    public static ArrayList<String> chooseDiff(String diffChoice) throws FileNotFoundException {
        File theFile = new File("Easy_Words.txt");
        Scanner file = new Scanner(theFile);
        ArrayList<String> easyWords = new ArrayList<String>();
        while (file.hasNext()) {
            easyWords.add(file.nextLine());
        }
        File theFile2 = new File("Medium_Words.txt");
        Scanner file2 = new Scanner(theFile2);
        ArrayList<String> mediumWords = new ArrayList<String>();
        while (file2.hasNext()) {
            mediumWords.add(file2.nextLine());
        }
        File theFile3 = new File("Hard_Words.txt");
        Scanner file3 = new Scanner(theFile3);
        ArrayList<String> hardWords = new ArrayList<String>();
        while (file3.hasNext()) {
            hardWords.add(file3.nextLine());
        }


        switch (diffChoice) {
            case "1":
                return easyWords;
            case "2":
                //retrieve medium words
                return mediumWords;
            case "3":
                //retrieve hard words
                return hardWords;
        }
        return easyWords;
    }
    
//This gets a random word from the arraylist you pass into it
    public static String getTheWord(ArrayList<String> theWords){
        Random ran = new Random();
        int ranWord = ran.nextInt(theWords.size());
        String wordRand = theWords.get(ranWord);
        return wordRand;
    }
    
     // This method takes input from the user. Calls chooseDiff and then calls getTheWord on the arraylist returned from chooseDiff
    //returns the word that the user will have to guess
    public static String theWord() throws FileNotFoundException {
        System.out.println("Press 1 for easy, 2 for medium, 3 for hard.");
        Scanner scan = new Scanner(System.in);
        try{
           String userChoice = scan.next();
            ArrayList<String> words = chooseDiff(userChoice);
            String wordToGuess = getTheWord(words);
            return wordToGuess;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (InputMismatchException ex){
            System.err.println("Incorrect value entered");
            ex.printStackTrace();
        }


        return null;
    }
    
    //This method takes a list of characters and the string the user has to guess.
    //Returns the wordState string
    //if the list of characters contains the characters of the word add the letter... else: add an underscore
    public static String wordState(List<Character> allRightGuesses, String theWord){
        String wordsState ="";
        for (char letters :theWord.toCharArray()) {
            if (allRightGuesses.contains(letters)) {
                wordsState += String.format("%c", letters);
            } else {
                 wordsState += "_";
            }

        }
           return wordsState;
    }
    
   //This returns nothing. Will check to see if letter is in the word and if its not it increases the wrong guesses int and displays the hangman art,
    //and lets you know how many guesses you have left and prints your wrong guesses. If you guess the letter it will play the clapping sound.
    //if you win it will print that you have won
    public static void hang (String guess, String wordToGuess, String underscore, ArrayList < String > allWrongGuesses, ArrayList < String > allRightGuesses) throws
                IOException, UnsupportedAudioFileException, LineUnavailableException {
            String newunderscore = "";
            for (int i = 0; i < wordToGuess.length(); i++) {

                if (wordToGuess.charAt(i) == guess.charAt(0)) {
                    newunderscore += guess.charAt(0);
                } else if (underscore.charAt(i) != '_') {
                    newunderscore += wordToGuess.charAt(i);
                } else {
                    newunderscore += "_";
                }

            }

        //If the letter is not in the word
            if (underscore.equals(newunderscore)) {
                wrongGuesses++;
                displayHangman(wrongGuesses);
                System.out.println("Sorry :( Incorrect guess!" + " Guesses left: " + (7 - wrongGuesses));
                soundEffects.incorrectSoundEffect();
                System.out.println("Wrong Guesses:");
                for (String theWrongGuess : allWrongGuesses) {
                    System.out.print(theWrongGuess + " ");

                }
                //this runs if the letter is in the word
            } else {
                soundEffects.correctSoundEffect();
                underscore = newunderscore;
            }
        //if you solved the word
            if (underscore.equals(wordToGuess)) {
                System.out.println("You have solved the word. It was " + wordToGuess);
            }

        }

        
}
