package Hangman;

public class drawHangMan {


    public static void displayHangman() {
        // Variable for amount of wrong guesses. Once the player reaches 7 guesses the game will end and show the word
        //that the player couldn't figure out.
        int wrong_Guesses = 0;
        
        if (wrong_Guesses == 0){
            System.out.println("   _________");
            System.out.println("   |      _|_");
            System.out.println("   | ")
            System.out.println("   | ");
            System.out.println("   | ");
            System.out.println("___|___");     
        }
            

        else if(wrong_Guesses == 1) {
            System.out.println("   _________");
            System.out.println("   |      _|_");
            System.out.println("   |       0");
            System.out.println("   | ");
            System.out.println("   | ");
            System.out.println("___|___");
        }
        

        else if (wrong_Guesses == 2) {
            System.out.println("   _________");
            System.out.println("   |      _|_");
            System.out.println("   |       0");
            System.out.println("   |       |");
            System.out.println("   | ");
            System.out.println("   | ");
            System.out.println("___|___");
        }
        
        else if (wrong_Guesses == 3) {
            
            System.out.println("   _________");
            System.out.println("   |      _|_");
            System.out.println("   |       0");
            System.out.println("   |       |");
            System.out.println("   |       |");
            System.out.println("   | ");
            System.out.println("___|___");
    
        }
        
        else if (wrong_Guesses == 4) {
            
            System.out.println("   _________");
            System.out.println("   |      _|_");
            System.out.println("   |       0");
            System.out.println("   |      /|");
            System.out.println("   |       |");
            System.out.println("___|___");
        }
        
        else if (wrong_Guesses == 5) {
            
            System.out.println("   _________");
            System.out.println("   |      _|_");
            System.out.println("   |       0");
            System.out.println("   |      /|\\");
            System.out.println("   |       |");
            System.out.println("___|___");
        }
        
        else if (wrong_Guesses == 6) {
            System.out.println("   _________");
            System.out.println("   |      _|_");
            System.out.println("   |       0");
            System.out.println("   |      /|\\");
            System.out.println("   |       |");
            System.out.println("   |      / ");
            System.out.println("___|___");
        }
        

        else if (wrong_Guesses == 7) {
            System.out.println("   _________");
            System.out.println("   |      _|_");
            System.out.println("   |       0");
            System.out.println("   |      /|\\");
            System.out.println("   |       |");
            System.out.println("   |      / \\");
            System.out.println("___|___ ");
            System.out.println("Game over :(");
        }
        

    }

}
