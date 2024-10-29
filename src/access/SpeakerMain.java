package access;

public class SpeakerMain {
    public static void main(String[] args) {

        Speaker spk = new Speaker(90);
        spk.volumeUp();
        spk.volumeUp();
        spk.showVolume();
        spk.volumeDown();
        spk.showVolume();

//        spk.volume = 200;
        spk.showVolume();
    }
}
