public class App {
public static long potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return (long) base * potencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        int base = 2;
        int exponente = 5;
        
        long resultado = potencia(base, exponente);
        
        System.out.println(base + " elevado a la " + exponente + " es: " + resultado);
    }
}