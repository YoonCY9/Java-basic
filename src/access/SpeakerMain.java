package access;

public class SpeakerMain {

    public static void main(String[] args) {
        Speaker speaker = new Speaker(500);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        
    }
}
