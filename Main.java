package Hangman;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import static Hangman.Words.chooseDiff;
import static Hangman.Words.getTheWord;


public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to our Hangman Game!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Press 1 for easy, 2 for medium, 3 for hard.");
        String userChoice = scan.nextLine();
        ArrayList<String> words = chooseDiff(userChoice);
        String wordToGuess = getTheWord(words);
        System.out.println(wordToGuess);
    }
}
