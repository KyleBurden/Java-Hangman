package Hangman;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Words {
    private static int wrongGuesses = 0;

    public static int getWrongGuesses() {
        return wrongGuesses;
    }
    
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

    public static String getTheWord(ArrayList<String> theWords){
        Random ran = new Random();
        int ranWord = ran.nextInt(theWords.size());
        String wordRand = theWords.get(ranWord);
        return wordRand;
    }
     public static String theWord() throws FileNotFoundException {
        System.out.println("Press 1 for easy, 2 for medium, 3 for hard.");
        Scanner scan = new Scanner(System.in);
        int userChoice = scan.nextInt();
        ArrayList<String> words = chooseDiff(userChoice);
        String wordToGuess = getTheWord(words);
        return wordToGuess;
    }
    
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

            if (underscore.equals(newunderscore)) {
                wrongGuesses++;
                displayHangman(wrongGuesses);
                System.out.println("Sorry :( Incorrect guess!");
                soundEffects.incorrectSoundEffect();
                System.out.println("Wrong Guesses:");
                for (String theWrongGuess : allWrongGuesses) {
                    System.out.print(theWrongGuess + " ");

                }
            } else {
                soundEffects.correctSoundEffect();
                underscore = newunderscore;
            }
            if (underscore.equals(wordToGuess)) {
                System.out.println("You have solved the word. It was " + wordToGuess);
            }

        }

        
}
