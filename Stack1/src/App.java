
import java.util.ArrayDeque;
import java.util.Deque;

public class App {
    public static void main(String[] args) {
        Deque<String> historial = new ArrayDeque<>();

        historial.push("https://www.google.com/?hl=es_419");
        historial.push("https://en.wikipedia.org/wiki/Team_Fortress_2");
        historial.push("https://github.com/Sundown-uwu/EstructuraDeDatos");
        
        System.err.println("Historial: ");
        for(String pagina : historial){
            System.out.println(pagina);
        }
        System.out.println("Borrando del historial: " + historial.pop());

        System.out.println("Pagina actual: "+ historial.peek());

        historial.push("https://www.youtube.com");

             System.err.println("Historial: ");
        for(String pagina : historial){
            System.out.println(pagina);
        }
        }
    }
