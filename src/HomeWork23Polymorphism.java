import helper.ClassicMusic;
import helper.MusicStyles;
import helper.PopMusic;
import helper.RockMusic;

public class HomeWork23Polymorphism {
        public static void main(String[] args) {
                MusicStyles popMusicBand = new PopMusic();
                MusicStyles rockMusicBand = new RockMusic();
                MusicStyles classicMusicBand = new ClassicMusic();

                MusicStyles[] musicBands = {popMusicBand, rockMusicBand, classicMusicBand};

                for (MusicStyles band : musicBands) {
                        band.playMusic();
                }
        }
}
