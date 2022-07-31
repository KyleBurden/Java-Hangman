package Hangman;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Words {
    
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
}
