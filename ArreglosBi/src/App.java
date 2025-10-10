
public class App {
    public static void main(String[] args) throws Exception {
        // int[][] arrBiA = new int[4][4];

        // int[][] arrBiB;

        // arrBiB = new int [4][4];

        // System.out.println(arrBiB[0][0]);

        // arrBiA[0][3] = 10;

        // for(int i = 0; i < arrBiB.length; i++){
        //     for (int j = 0; j < arrBiB.length; j++){
        //         System.out.println(arrBiB[i][j]);
        //     }
        //     System.out.println();
        // }
        // System.out.println(arrBiB[0][3]);
        // int[][] arrBiC={
        //     {1,2,3,4},
        //     {1,2,3,4},
        //     {1,2,3,4},
        //     {1,2,3,4}
        // };
        // for (int[] fila:arrBiC){
        //     for(int valor : fila){
        //         System.out.print(valor);
        //     }
        //     System.out.println();
        // }
        // System.out.println(Arrays.deepToString(arrBiC));

        // int[][] arrBiD={
        //     {1,2,3},
        //     {1,2,3,4,5},
        //     {1},
        //     {2,2,2,2,2,2}
        // };
        // System.out.println(Arrays.toString(arrBiD[0]));
        // for(int i = 0; i<arrBiD.length; i++){
        //     for(int j = 0; j < arrBiD[i].length; j++){
        //         System.out.print(arrBiD[i][j]);
        //     }
        //     System.out.println();
        // }
        // int[] a={1,2,3,4};
        // int[] b=new int[4];
        // System.out.println(Arrays.toString(b));
        // System.arraycopy(a, 0, b, 0, 4);

        // int[] c = Arrays.copyOf(a, 5);
        // System.out.println(Arrays.toString(c));


        int[][] arrTest={
            {1,3,7,8},
            {0,6,3,1},
            {1,2,3,4},
            {0,5,3,0},
            {2,5,9,0}
        };
        int suma = 0;
        for(int i = 0; i<arrTest.length; i++){
            for(int j = 0; j < arrTest[i].length; j++){
                suma += arrTest[i][j];
            }
    }
                System.out.println("Suma del arreglo: " + suma);

}
}
