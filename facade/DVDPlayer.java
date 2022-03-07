package facade;

public class DVDPlayer {
    public void turnOn() {
        System.out.println("DVDPlayer is on");
    }

    public void turnOff() {
        System.out.println("DVDPlayer is off");
    }

    public void play(String dvdName) {
        System.out.println("Now playing: " + dvdName);
    }

    public void next() {
        System.out.println("Play next song");
    }
}
