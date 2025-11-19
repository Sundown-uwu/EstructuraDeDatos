
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos numeros desdeas ingresar?");
        int n = scanner.nextInt();
        scanner.nextLine();

        int[] originales = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingresa el " + (i + 1) + " numero:");
            originales[i] = scanner.nextInt();
        }

        int contadorPares = 0;
        int contadorImpares = 0;

        for (int num : originales) {
            if (num % 2 == 0) contadorPares++;
            else contadorImpares++;
        }

        int[] pares = new int[contadorPares];
        int[] impares = new int[contadorImpares];

        int ip = 0, ii = 0;
        for (int num : originales) {
            if (num % 2 == 0) {
                pares[ip++] = num;
            } else {
                impares[ii++] = num;
            }
        }

       ParesUtils.selectionSort(pares);
        ParesUtils.selectionSort(impares);

        System.out.println("Arreglo original:");
        ParesUtils.imprimirArreglo(originales);

        System.out.println("Arreglo de pares ordenado:");
        ParesUtils.imprimirArreglo(pares);

        System.out.println("Arreglo de impares ordenado:");
        ParesUtils.imprimirArreglo(impares);
    }

}
