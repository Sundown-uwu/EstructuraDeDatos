public class ArrayQueue<T> implements iQueue<Object> {
private Object[] data;
private int rear; //Indice de insercion
private int front;
private int size;
private static final int INITIAL_CAPACITY=10; //Constante para el tamaño inicial del array

public ArrayQueue(){
    this.data = new Object[INITIAL_CAPACITY];
    this.rear = 0;
    this.front = 0;
    this.size = 0;
}

@Override
public void offer(Object element) {
    //verificar la capacidad del Array
    expendCapacity();
    data[rear] = element; //Pone el elemento en el indice asignado (rear)
    rear = (rear + 1) % data.length;
    size++;
}

@SuppressWarnings("uncheked")
@Override
public Object poll() {
    if(isEmpty()){
        System.out.println("La queue esta vacia");
        return null;
    }
    T result = (T) data[front];
    data[front]=null;
    front = (front+1) % data.length;
    size--;
    return result;
}

@Override
public Object peek() {
    if(isEmpty()){
        System.out.println("La queue esta vacia");
        return null;
    }
    return data[front];
}

@Override
public void clear() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'clear'");
}

@Override
public void print() {
    StringBuilder sb= new StringBuilder();
    sb.append("[");
    for(int i=0; i<size; i++){
        sb.append(data[(front+i)%data.length]);
        if(i!=0) sb.append("->");
    }
    sb.append("]");
    System.out.println(sb.toString());
}

@Override
public boolean isEmpty() {
    return size ==0; //Verifica que size sea 0, en caso 
}

@Override
public int getSize() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getSize'");
}
private void expendCapacity(){
    Object[] newArr= new Object[data.length*2];
    for(int i = 0; i<size; i++){
        newArr[i] = data[(front + i) % data.length];
    }
}
}
