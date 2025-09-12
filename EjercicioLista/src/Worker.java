public class Worker {
    private int id;
    private String nombre;
    private double sueldo;

    public Worker(int id, String nombre, double sueldo){
        this.id = id;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public double getSueldo(){
        return sueldo;
    }
    public void setId(int id) {
    this.id = id;
    }

    public void setNombre(String nombre) {
    this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
    }

     @Override
    public String toString() {
        return "Worker{" +
               "id=" + id +
               ", nombre='" + nombre + '\'' +
               ", sueldo=" + sueldo +
               '}';

}
}
