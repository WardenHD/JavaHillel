public class PopMusic extends MusicStyles { 
    private final String bandName;

    public PopMusic(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public void playMusic() {
        System.out.println(bandName + " is playing pop music!");
    }
}