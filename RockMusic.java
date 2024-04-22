public class RockMusic extends MusicStyles {
    private final String bandName;

    public RockMusic(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public void playMusic() {
        System.out.println(bandName + " is playing ROCK MUSIC!!!");
    }
}
