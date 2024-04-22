public class ClassicMusic extends MusicStyles {
    private final String bandName;

    public ClassicMusic(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public void playMusic() {
        System.out.println(bandName + " is playing classic music!");
    }

    public String getBandName() {
        return bandName;
    }
}
