// I made it with the abstract class because it doesn't need to be created, 
// and it is a better solution. I decided to use it instead of interface to have default implementation

public abstract class MusicStyles {
    public void playMusic() {
        System.out.println("Playing music by default!");
    }
}
