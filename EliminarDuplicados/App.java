import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[] arr = {4, 2, 9, 2, 4, 7, 1};

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(arr));

       
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);

        
        System.out.println("Arreglo ordenado:");
        System.out.println(Arrays.toString(arr));

        
        int[] sinDuplicados = eliminarDuplicados(arr);

        
        System.out.println("Arreglo sin duplicados:");
        System.out.println(Arrays.toString(sinDuplicados));
    }

    public static int[] eliminarDuplicados(int[] arr) {

        int contador = 1; 

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i - 1]){
                contador++;
            }
        }

        int[] nuevo = new int[contador];

        nuevo[0] = arr[0];
        int index = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i - 1]){
                nuevo[index] = arr[i];
                index++;
            }
        }

        return nuevo;
    }
}