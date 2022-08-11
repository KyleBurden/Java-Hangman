package Hangman;

public class drawHangMan {

    
    //Our ascii art which will display after each wrong guess
    public static void displayHangman(int wrong_Guesses) {
        
        if (wrong_Guesses == 0){
            System.out.println("   _________");
            System.out.println("   |      _|_");
            System.out.println("   | ");
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
