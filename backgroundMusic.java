package Hangman

import javax.sound.sampled.*;
import java.io.File;

public class backgroundMusic {

    
    //This will play our background music continuously
    //Sound may be loud lol******
    public static void backgroundSound() {

        try{
            File file = new File("ice_cream_truck.wav");

            if(file.exists()){
                AudioInputStream AudioInput=  AudioSystem.getAudioInputStream(file);
                Clip sound_clip = AudioSystem.getClip();
                sound_clip.open(AudioInput);
                sound_clip.start();
                sound_clip.loop(Clip.LOOP_CONTINUOUSLY);
                
            }

        } catch (Exception ex){
            ex.printStackTrace();
        }


    }


}
