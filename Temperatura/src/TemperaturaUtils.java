public class TemperaturaUtils {

    public static void insertionSort(double[] arr) {
        for (int i = 1; i < arr.length; i++) {
            double temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void imprimirArreglo(double[] arr) { // Imprimir arreglo
        for (double v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public static double[] obtenerBajas(double[] arr, int n) {
        int size = Math.min(n, arr.length);
        double[] bajas = new double[size];

        for (int i = 0; i < size; i++) {
            bajas[i] = arr[i];
        }

        return bajas;
    }

    public static double[] obtenerAltas(double[] arr, int n) {
        int size = Math.min(n, arr.length);
        double[] altas = new double[size];
        int index = 0;

        for (int i = arr.length - size; i < arr.length; i++) {
            altas[index++] = arr[i];
        }

        return altas;
    }
}
