import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class Letras {
    public static void mostrarLetras(int n) {

        int inicio_letra = 0, fin_letra = 0, indice_cancion = 0;
		String [][] info_canciones;
		StringBuilder letra_cancion;

        String[] canciones = {"A Dios le pido", "Como Camarón", "Cuando sea grande", "Dame amor", "El muelle de San Blás", "En algún lugar", "Don't cry", "Maldito duende", "Hey Jude", "La camisa negra", "La gasolina", "La playa", "Laura no esta", "Me gustas tú", "Me muero", "Mírame", "Nada valgo sin tu amor", "París", "Rayando el sol", "Rosas", "Tu peor error", "Vino tinto", "Vivo por ella", "Yesterday"};
        canciones = ConsoleFile.readBigFile("recursos/letras.csv");
		info_canciones = ConsoleData.dataList(canciones);
        
        switch (n) {
            case 0: 
                indice_cancion = 14;
                break;
            case 1: 
                indice_cancion = 15;
                break;
            case 2: 
                indice_cancion = 1;
                break;
            case 3: 
                indice_cancion = 16;
                break;
            case 4: 
                indice_cancion = 2;
                break;
            case 5: 
                indice_cancion = 3;
                break;
            case 6: 
                indice_cancion = 23;
                break;
            case 7: 
                indice_cancion = 4;
                break;
            case 8: 
                indice_cancion = 22;
                break;
            case 9: 
                indice_cancion = 5;
                break;
            case 10: 
                indice_cancion = 21;
                break;
            case 11: 
                indice_cancion = 17;
                break;
            case 12: 
                indice_cancion = 6;
                break;
            case 13: 
                indice_cancion = 7;
                break;
            case 14: 
                indice_cancion = 8;
                break;
            case 15: 
                indice_cancion = 0;
                break;
            case 16: 
                indice_cancion = 9;
                break;
            case 17: 
                indice_cancion = 18;
                break;
            case 18: 
                indice_cancion = 10;
                break;
            case 19: 
                indice_cancion = 11;
                break;
            case 20: 
                indice_cancion = 12;
                break;
            case 21: 
                indice_cancion = 13;
                break;
            case 22: 
                indice_cancion = 19;
                break;
            case 23: 
                indice_cancion = 20;
                break;
            default:
                break;
        }

        inicio_letra = ConsoleInput.stringToInt(info_canciones[indice_cancion][ConsoleData.INICIO_CANCION]);
        fin_letra = ConsoleInput.stringToInt(info_canciones[indice_cancion][ConsoleData.FIN_CANCION]);

        letra_cancion = Programa.obtenerLetraCancion(inicio_letra, fin_letra, canciones);

        Programa.imprimir(letra_cancion.toString());
    }
}
