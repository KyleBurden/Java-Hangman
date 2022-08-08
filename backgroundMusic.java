

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class backgroundMusic {

    public static void main(String args[]) {

        try{
            File file = new File("ice_cream_truck.wav");

            if(file.exists()){
                Scanner scan = new Scanner(System.in);
                AudioInputStream AudioInput=  AudioSystem.getAudioInputStream(file);
                Clip sound_clip = AudioSystem.getClip();
                sound_clip.open(AudioInput);
                sound_clip.start();
                sound_clip.loop(Clip.LOOP_CONTINUOUSLY);
                String response = scan.next();


            }

        } catch (Exception ex){
            ex.printStackTrace();
        }





    }


}
