package Hangman

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;


public class soundEffects {

    //This is going to play the correct sound when a user guesses a right letter

    public static void correctSoundEffect() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("applause_y.wav");
        AudioInputStream InputStream = AudioSystem.getAudioInputStream(file);
        Clip clip  = AudioSystem.getClip();
        clip.open(InputStream);
        clip.start();
    }
    
    //This is going to play the incorrect sound when a user guesses a wrong letter
    public static void incorrectSoundEffect() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        File file = new File("quick_fart_x.wav");
        AudioInputStream InputStream = AudioSystem.getAudioInputStream(file);
        Clip clip  = AudioSystem.getClip();
        clip.open(InputStream);
        clip.start();   

    }



}
