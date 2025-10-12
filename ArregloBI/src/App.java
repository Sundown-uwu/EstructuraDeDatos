import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        int[][] Test = {
            {1},
            {6, 3, 1},
            {1, 2, 3, 4},
            {0, 5, 3, 0},
            {2, 5, 9},
            {2, 4, 8, 9, 10}
        };

        for (int i = 0; i < Test.length; i++) {
            int[] original = Test[i];
            int[] nueva = new int[original.length + 1];

            for (int j = 0; j < original.length; j++) {
                nueva[j] = original[j];
            }

            int nuevoValor = original[original.length - 1] + 1;
            nueva[nueva.length - 1] = nuevoValor;
            
            Test[i] = nueva;
        }
        for (int[] row : Test) {
            System.out.println(Arrays.toString(row));
        }
    }
}
