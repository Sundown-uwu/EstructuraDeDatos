import java.util.Arrays;

class ArrayStack<T> {
private T[] stack;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        stack = (T[]) new Object[DEFAULT_CAPACITY];
        top = 0;
    }

    public void push(T item) {
        if (top == stack.length) {
            resize(stack.length * 2);
        }
        stack[top] = item;
        top++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Error: La pila está vacía (Stack Underflow)");
        }
        top--;
        T item = stack[top];
        stack[top] = null;
        return item;
    }


    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Error: La pila está vacía");
        }
        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    private void resize(int newCapacity) {
        stack = Arrays.copyOf(stack, newCapacity);
    }
}
