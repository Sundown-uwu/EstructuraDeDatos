public class TemperaturaReport {

    public double min;
    public double max;
    public double rango;
    public double[] bajas;
    public double[] altas;

    public TemperaturaReport(double[] ordenado) {
        this.min = ordenado[0];
        this.max = ordenado[ordenado.length - 1];
        this.rango = max - min;
        this.bajas = TemperaturaUtils.obtenerBajas(ordenado, 3);
        this.altas = TemperaturaUtils.obtenerAltas(ordenado, 3);
    }

    public void imprimirResultados() {
        System.out.println("Temperatura mínima: " + min);
        System.out.println("Temperatura máxima: " + max);
        System.out.println("Rango: " + rango);

        System.out.print("3 más bajas: ");
        TemperaturaUtils.imprimirArreglo(bajas);

        System.out.print("3 más altas: ");
        TemperaturaUtils.imprimirArreglo(altas);
    }
}
