import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese el tamaño del arreglo");
        int n = scanner.nextInt();
        scanner.nextLine();

        int[] numeros = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Ingrese el numero " + (i+1) + ":");
            numeros[i] = scanner.nextInt();
            scanner.nextLine();
        }
        int[] original = new int[n];
        for(int i = 0; i < n; i++){
            original[i] = numeros[i];
        }

        System.err.println("Arreglo original");
        System.err.println(Arrays.toString(original));

        BubbleSortUtils bubbleSortUtils = new BubbleSortUtils();
        bubbleSortUtils.sort(numeros);
        bubbleSortUtils.min(numeros);
        bubbleSortUtils.max(numeros);
        bubbleSortUtils.diff(numeros);
    }
}