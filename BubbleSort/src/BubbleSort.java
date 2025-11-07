
import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] arr){
        int n = arr.length;

        //Recorre todos los elementos del arreglo
        for (int i = 0; i < n -1; i++ ){
            //Recorremos los elementos adyacentes -1 -i (por los que ya fueron recorridos)
            for(int j = 0; j< n-1 -i; j++){
                if(arr[j] > arr[j+1]){
                    //Se realiza el intercambio
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //Impresion
        System.err.println("Arreglo arreglado");
        System.err.println(Arrays.toString(arr));
    }
}
