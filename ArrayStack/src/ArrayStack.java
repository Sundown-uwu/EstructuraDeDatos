public class ArrayStack<T> implements iStack<T>{
    private Object[] data;
    private int top;

    //Constructor 1
    public ArrayStack() {
        this(10);//Invoca al constructor 2
    }
//Constructor 2
    public ArrayStack(int Capacidad) {
        this.data = new Object[Capacidad];
        this.top=0;
    }
    @Override
    public void push(T elemet) {
        data[top] = (T) elemet;
        top++;
    }
    @SuppressWarnings("unchecked")
    @Override
    public T pop() {
        if(isEmpty()){
            System.out.println("La pila esta vacia");
            return null;
        }
        T value = (T) data[--top];
        data[top]=null;
        return value;
    }
    @Override
    public T peek() {
        if(isEmpty()){
            System.out.println("La pila esta vacia");
            return null;
        }
        return (T) data[top];
    }
    @Override
    public void clear() {
        for (int i = 0; i < top; i++) {
            data[i] = null;
        }
        top = 0;
    }
    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }
    @Override
    public boolean isEmpty() {
        return top==0;
    }
    @Override
    public void print() {
        StringBuilder sb= new StringBuilder();
        sb.append("[");
        for(int i = top-1; i >=0; i--){
            sb.append(data[i]);
            if(i!=0) sb.append("->");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    
}
