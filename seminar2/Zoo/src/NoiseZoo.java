import java.util.List;

public class NoiseZoo {
    private List<Speakable> speakables;

    public NoiseZoo(List<Speakable> speakables) {
        this.speakables = speakables;
    }

    public void spiakAll() {
        for (Speakable speakble : speakables) {
            speakble.speak();
        }
    }
}
