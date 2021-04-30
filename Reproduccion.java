
import java.io.File;
import java.io.IOException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class Reproduccion extends Thread {
    
    private static String[] sonido = {"canciones/A_Dios_le_pido.mid","canciones/Como_Camaron.mid","canciones/Cuando_Sea_Grande.mid","canciones/dame_amor.mid","canciones/El_muelle_de_San_Blas.mid","canciones/En_algun_lugar.mid","canciones/Guns_n_Roses_-_Don't_Cry.mid","canciones/HEROES_DEL_SILENCIO_-_Maldito_duende.mid","canciones/Hey_jude.mid","canciones/La_camisa_negra.mid","canciones/La_Gasolina.mid","canciones/La_playa.mid","canciones/Laura.mid","canciones/Me_gustas_tu.mid","canciones/memuero.mid","canciones/Mirame.mid","canciones/Nada_valgo_sin_tu_amor.mid","canciones/Paris.mid","canciones/Rayando_el_sol.mid","canciones/Rosas.mid","canciones/tu_peor_error.mid","canciones/Vino_Tinto.mid","canciones/Vivo_por_ella.mid","canciones/Yesterday.mid"};

    private static Sequencer sequencer;
    public static boolean reproduciendo;

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

    public static void detener(){
        if(sequencer!=null)
        {
            if(sequencer.isOpen())
            {
                sequencer.stop();
                sequencer.close();
            }
        }
        reproduciendo = false;
    }

}