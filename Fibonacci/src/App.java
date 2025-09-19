import java.util.Scanner;
public class App {

    public static void fiboSola(int posicion){
        long a = 0;
        long b = 1;

                System.out.print("Serie de Fibonacci hasta la posición " + posicion + ": " + a + ", " + b);
  for (int i = 3; i <= posicion; i++) {
            long siguienteNumero = a + b;
            System.out.print(", " + siguienteNumero);
            a = b;
            b = siguienteNumero;
        }
        System.out.println();
    }

    public static  void main(String[] args) throws Exception {
 Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa la posición hasta la cual deseas ver la serie de Fibonacci: ");
            int posicionDeseada = scanner.nextInt();
            fiboSola(posicionDeseada);
  
    }
}
