package Hangman;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static Hangman.Words.*;
import static Hangman.DrawMan.displayHangman;



public class Main {
    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        String continueGame = "yes";
        String continueGame2;
        do {
            System.out.println(" _                                             \n" +
                    "| |                                            \n" +
                    "| |__   __ _ _ __   __ _ _ __ ___   __ _ _ __  \n" +
                    "| '_ \\ / _` | '_ \\ / _` | '_ ` _ \\ / _` | '_ \\ \n" +
                    "| | | | (_| | | | | (_| | | | | | | (_| | | | |\n" +
                    "|_| |_|\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|\n" +
                    "                    __/ |                      \n" +
                    "                   |___/                 ");
            System.out.println();
            System.out.println("=========================================");
            System.out.println("Welcome to our Hangman Game!");
            System.out.println("Created by Kyle Burden and Adam Barry");
            //next line calls theWord()... It will ask for 1, 2 or 3 to pick the word difficulty
            String hiddenWord = theWord();
            //the word replaced with all underscores
            String underscore = new String(new char[hiddenWord.length()]).replace("\0", "_");
            displayHangman(0);
            System.out.println(underscore);
            ArrayList<String> allWrongGuesses = new ArrayList<>();
            ArrayList<String> allRightGuesses = new ArrayList<>();
            List<Character> allGuesses = new ArrayList<>();

            
            //game will run util user has 7 wrong guesses
            while (Words.getWrongGuesses() < 7) {
                backgroundMusic.backgroundSound();
                Scanner guess = new Scanner(System.in);
                String guess2 = guess.next();
                char chars = guess2.charAt(0);
                allGuesses.add(chars);

                if (!hiddenWord.contains(guess2)) {
                    allWrongGuesses.add(guess2);
                }
                System.out.println(wordState(allGuesses, hiddenWord));
                hang(guess2, hiddenWord, underscore, allWrongGuesses, allRightGuesses);
                if (hiddenWord.equals(wordState(allGuesses, hiddenWord))) {
                    System.out.println("Congrats you win!");
                    System.out.println("__  __   ______   __  __       __ __ __    ________  ___   __        __        __       \n" +
                            "/_/\\/_/\\ /_____/\\ /_/\\/_/\\     /_//_//_/\\  /_______/\\/__/\\ /__/\\     /__/\\     /__/\\     \n" +
                            "\\ \\ \\ \\ \\\\:::_ \\ \\\\:\\ \\:\\ \\    \\:\\\\:\\\\:\\ \\ \\__.::._\\/\\::\\_\\\\  \\ \\    \\.:\\ \\    \\.:\\ \\    \n" +
                            " \\:\\_\\ \\ \\\\:\\ \\ \\ \\\\:\\ \\:\\ \\    \\:\\\\:\\\\:\\ \\   \\::\\ \\  \\:. `-\\  \\ \\    \\::\\ \\    \\::\\ \\   \n" +
                            "  \\::::_\\/ \\:\\ \\ \\ \\\\:\\ \\:\\ \\    \\:\\\\:\\\\:\\ \\  _\\::\\ \\__\\:. _    \\ \\    \\__\\/_    \\__\\/_  \n" +
                            "    \\::\\ \\  \\:\\_\\ \\ \\\\:\\_\\:\\ \\    \\:\\\\:\\\\:\\ \\/__\\::\\__/\\\\. \\`-\\  \\ \\     /__/\\     /__/\\ \n" +
                            "     \\__\\/   \\_____\\/ \\_____\\/     \\_______\\/\\________\\/ \\__\\/ \\__\\/     \\__\\/     \\__\\/");
                    break;

                }

            }

           //condition to see if you lose
            if (Words.getWrongGuesses() == 7){
                System.out.println("__  __   ______   __  __       __       ______   ______   ______      \n" +
                        "/_/\\/_/\\ /_____/\\ /_/\\/_/\\     /_/\\     /_____/\\ /_____/\\ /_____/\\     \n" +
                        "\\ \\ \\ \\ \\\\:::_ \\ \\\\:\\ \\:\\ \\    \\:\\ \\    \\:::_ \\ \\\\::::_\\/_\\::::_\\/_    \n" +
                        " \\:\\_\\ \\ \\\\:\\ \\ \\ \\\\:\\ \\:\\ \\    \\:\\ \\    \\:\\ \\ \\ \\\\:\\/___/\\\\:\\/___/\\   \n" +
                        "  \\::::_\\/ \\:\\ \\ \\ \\\\:\\ \\:\\ \\    \\:\\ \\____\\:\\ \\ \\ \\\\_::._\\:\\\\::___\\/_  \n" +
                        "    \\::\\ \\  \\:\\_\\ \\ \\\\:\\_\\:\\ \\    \\:\\/___/\\\\:\\_\\ \\ \\ /____\\:\\\\:\\____/\\ \n" +
                        "     \\__\\/   \\_____\\/ \\_____\\/     \\_____\\/ \\_____\\/ \\_____\\/ \\_____\\/ ");
                System.out.println("The word was " + hiddenWord);
            }

            //To see if user wants to play again
            Scanner continueScan = new Scanner(System.in);
            System.out.println();
            System.out.println("Type yes to play again...");
            continueGame2 = continueScan.nextLine();


        } while (continueGame2.equals("yes") || continueGame2.equals("Yes"));


    }
}
