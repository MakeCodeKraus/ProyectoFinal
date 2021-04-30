
import java.io.File;
import java.io.IOException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class Reproduccion extends Thread {
    private static String[] sonido = {"canciones/El_muelle_de_San_Blas.mid","canciones/La_playa.mid","canciones/memuero.mid"};
    private static Sequencer sequencer;

    public static void empezar(int n) {
        try {
            sequencer = MidiSystem.getSequencer();

            if (sequencer == null) {
                System.err.println("Sequencer device not supported");
                return;
            }
            sequencer.open();
            Sequence sequence = MidiSystem.getSequence(new File(sonido[n]));
            sequencer.setSequence(sequence);
            sequencer.start();

        } catch (MidiUnavailableException | InvalidMidiDataException | IOException ex) {
            ex.printStackTrace();
        }

    }


}