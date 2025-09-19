import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int i = 0;
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido ingrese el numero que desea sumar: \n");
        
        int n1 = scanner.nextInt();
        i = n1;
        while (i != 0) {
            total = total + i;
            i--;

        }
        System.out.println("Suma(" + n1 +")= " + total);
    }
}
