import java.util.Arrays;

public class BubbleSortUtils {
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
        System.err.println("Arreglo arreglado (duh):");
        System.err.println(Arrays.toString(arr));
    }

    public void min(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("El valor minimo es: " + min);
    }

        public void max(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("El valor minimo es: " + max);
    }

    public void diff(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int diff = max - min;
        System.out.println("La diferencia entre el valor maximo y minimo es: " + diff);
        
    }
}