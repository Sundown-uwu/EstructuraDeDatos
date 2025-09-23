import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ListaMaterias lista = new ListaMaterias();
        lista.agregar("Matematicas");
        lista.agregar("Fisica");
        lista.agregar("Quimica");
        lista.agregar("Historia");
        lista.agregar("Programacion");

        lista.imprimir();
        Scanner scanner = new Scanner(System.in);
        System.err.println("Ingrese la materia a buscar: ");
        String buscar = scanner.nextLine();
        System.out.println("Buscando: " + buscar);
        if(lista.contiene(buscar)){
            System.err.println("¡Materia Encontrada!");
        }else{
            System.err.println("Materia no encontrada :C");
        }

    }
}
