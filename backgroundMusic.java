import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.nio.file.Paths;

public class backgroundMusic {
    MediaPlayer mediaPlayer;
    public void playBackgroundMusic() {
        String filename = "ice_cream_truck.wav";
        Media p = new Media(Paths.get(filename).toUri().toString());
        mediaPlayer = new MediaPlayer(p);
        mediaPlayer.play();


    }












}
