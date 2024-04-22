public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicBands = new MusicStyles[]{new PopMusic("Blackpink"), 
            new ClassicMusic("Beethoven"), new RockMusic("The Beatles")};

        for(MusicStyles musicBand : musicBands) {
            musicBand.playMusic();
        }
    }
}
