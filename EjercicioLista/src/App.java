import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
            List<Worker> workers = new ArrayList<>();
            workers.add(new Worker(1, "Diego", 2000));
            workers.add(new Worker(2,"Heavy", 3000));
            workers.add(new Worker(3, "Calamardo", 900));
            workers.add(new Worker(4, "Niko Bellic", 4000));
            workers.add(new Worker(5, "El kevin", 10));
                workers.add(new Worker(6, "El chapo", 100000));

                System.out.println("Lista inicial: ");
                for (Worker worker : workers) {
                    System.out.println(worker);
                }
                double total = 0;
                for (Worker worker : workers) {
                    total += worker.getSueldo();
                }
                double salarioPromedio = total / 6;
                System.out.println("El salario promedio es: " + salarioPromedio);

                workers.removeIf(worker -> worker.getSueldo() < 1000);

                System.out.println("Lista con filtro: ");
                workers.forEach(System.out::println);


                
        }
    }
