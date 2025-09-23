import java.util.ArrayDeque;
import java.util.Queue;
public class App {
    public static void main(String[] args) throws Exception {

        Queue<cliente> queue = new ArrayDeque<>();
        cliente c1 = new cliente(1, "Elias");
        c1.agregarDocumento("Doc1");
        c1.agregarDocumento("Doc2");
        c1.agregarDocumento("Doc3");

        cliente c2 = new cliente(2, "Diego");
        c2.agregarDocumento("Doc1");

        cliente c3 = new cliente(3, "Sundown");
        c3.agregarDocumento("Doc1");
        c3.agregarDocumento("Doc2");

        queue.offer(c1);
        queue.offer(c2);
        queue.offer(c3);
        System.out.println("Cola inicial: " + queue );

        while (!queue.isEmpty()) {
            cliente actual =  queue.poll();
            System.out.println("Cliente actual: " + actual.name);
            actual.atender();
            System.out.println("Cola restante: " + queue);            
        }
        }
    }   
