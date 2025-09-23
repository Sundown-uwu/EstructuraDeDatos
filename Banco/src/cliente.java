import java.util.ArrayDeque;
import java.util.Deque;

public class cliente {
    int Id;
    String name;
    Deque<String> docs;

    cliente(int id, String name){
        this.Id = id;
        this.name = name;
        docs = new ArrayDeque<>();
    }
    public void agregarDocumento (String doc){
        docs.push(doc);
    }
    public void atender(){
        while (!docs.isEmpty()) {
            System.out.println("Documento retirado: " + docs.pop());
            
        }
    }
    @Override
    public String toString(){
        return name;
    }
}
