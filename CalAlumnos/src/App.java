import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas calificaciones deseas ingresar: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        String[] nombres = new String[n];
        double[] calificaciones = new double[n];

        for(int i = 0; i < n; i++){
            System.out.println("Ingrese el nombre del alumno " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.println("Introduce la calificacion del alumno, " + nombres[i] + ": ");
            calificaciones[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(calificaciones[j] < calificaciones[minIndex]){
                    minIndex = j;
                }
            }
            double tempCal = calificaciones[minIndex];
            calificaciones[minIndex] = calificaciones[i];
            calificaciones[i] = tempCal;

            String tempNombre = nombres[minIndex];
            nombres [minIndex] = nombres[i];
            nombres[i] = tempNombre;
        }
        System.out.println("Calificaciones Ordenadas: ");
        for(int i = 0; i < n; i++){
            System.out.println("Calificacion: " + calificaciones[i] + " Alumno:" + nombres[i]);
        }
        scanner.close();
    }
}
