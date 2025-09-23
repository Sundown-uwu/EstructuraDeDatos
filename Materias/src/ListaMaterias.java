
import java.util.ArrayList;

public class ListaMaterias {
    public ArrayList<String> materias;

    public ListaMaterias(){
        this.materias = new ArrayList<>();
    }
    public void agregar (String materia){
        this.materias.add(materia);
    }
    public boolean contiene (String materia){
        return this.materias.contains(materia);
    }
    public void imprimir(){
        System.err.println( "Materias: " + materias);
    }


}
