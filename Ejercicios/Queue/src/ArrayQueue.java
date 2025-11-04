import java.util.Stack;

class ArrayQueue<T> {
    private T[] queue;
    private int front;
    private int back;
    private int currentSize;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayQueue() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayQueue(int initialCapacity) {
        queue = (T[]) new Object[initialCapacity];
        front = 0;
        back = 0;
        currentSize = 0;
    }


    public void enqueue(T item) {
        if (currentSize == queue.length) {
            resize(queue.length * 2);
        }
        
        queue[back] = item;
        back = (back + 1) % queue.length;
        currentSize++;
    }


    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("La cola está vacía");
        }
        
        T item = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        currentSize--;
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("La cola está vacía");
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public int size() {
        return currentSize;
    }

    @SuppressWarnings("unchecked")
    private void resize(int newCapacity) {
        T[] newQueue = (T[]) new Object[newCapacity];
        
        for (int i = 0; i < currentSize; i++) {
            newQueue[i] = queue[(front + i) % queue.length];
        }
        
        queue = newQueue;
        front = 0;
        back = currentSize;
    }

    public void reverse() {
        Stack<T> stackAuxiliar = new Stack<>();

        while (!this.isEmpty()) {
            stackAuxiliar.push(this.dequeue());
        }


        while (!stackAuxiliar.isEmpty()) {
            this.enqueue(stackAuxiliar.pop());
        }
    }


    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < currentSize; i++) {
            sb.append(queue[(front + i) % queue.length]);
            if (i < currentSize - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

