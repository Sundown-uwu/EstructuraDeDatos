import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de temperaturas: ");
        int n = scanner.nextInt();

        double[] temps = new double[n];

        // Captura de datos
        for (int i = 0; i < n; i++) {
            System.out.print("Temperatura numero " + (i + 1) + ": ");
            temps[i] = scanner.nextDouble();
        }

        // Copia del arreglo original
        double[] original = new double[n];
        for (int i = 0; i < n; i++) {
            original[i] = temps[i];
        }

        // Imprimir original
        System.out.println("\nArreglo original:");
        TemperaturaUtils.imprimirArreglo(original);

        // Ordenar
        TemperaturaUtils.insertionSort(temps);

        // Crear reporte con resultados
        TemperaturaReport report = new TemperaturaReport(temps);

        // Imprimir ordenado
        System.out.println("\nArreglo ordenado:");
        TemperaturaUtils.imprimirArreglo(temps);

        // Imprimir reporte final
        System.out.println("\nResultados:");
        report.imprimirResultados();
    }
}
