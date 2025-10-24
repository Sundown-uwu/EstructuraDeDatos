public interface iQueue<T> {

    void offer (T element);
    T poll();
    T peek();
    void clear();
    void print();
    boolean isEmpty();
    int getSize();
}
