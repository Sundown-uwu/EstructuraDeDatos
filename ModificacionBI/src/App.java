import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int [][] arrInicial = {
            {1},
            {6,3,1},
            {1,2,3,4},
            {0,5,3,0},
            {2,5,9},
            {2,4,8,9,10}
        };

        for(int i = 0; i < arrInicial.length; i++) {
            int[] original = arrInicial[i];
            int[] nueva = new int [original.length + 1];

            for (int j = 0; j < original.length; j++){
                nueva[j] = original[j];
            }
            if(original.length % 2 == 0){
                int nuevo = original[0] + original[original.length - 1];
                nueva[nueva.length - 1] = nuevo;
            }else{
                nueva[nueva.length - 1]=0;
            }
            arrInicial[i]=nueva;
        }
        for(int[] row : arrInicial){
            System.out.println(Arrays.toString(row));
        }
    }
}
