import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Speakable> speakable = new ArrayList<>();
        speakable.add(new Dog());
        speakable.add(new Cat());
        speakable.add(new Radio());

        NoiseZoo noiseZoo = new NoiseZoo(speakable);
        noiseZoo.spiakAll();
    }
}
