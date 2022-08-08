import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;


public class soundEffects {


    public static void correctSoundEffect() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scan = new Scanner(System.in);
        File file = new File("applause_y.wav");
        AudioInputStream InputStream = AudioSystem.getAudioInputStream(file);
        Clip clip  = AudioSystem.getClip();
        clip.open(InputStream);
        clip.start();
        String response = scan.next();



    }

    public static void incorrectSoundEffect() throws LineUnavailableException, UnsupportedAudioFileException, IOException {

        Scanner scan = new Scanner(System.in);
        File file = new File("quick_fart_x.wav");
        AudioInputStream InputStream = AudioSystem.getAudioInputStream(file);
        Clip clip  = AudioSystem.getClip();
        clip.open(InputStream);
        clip.start();
        String response = scan.next();



    }



}
