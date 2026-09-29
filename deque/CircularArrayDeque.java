public class CircularArrayDeque<E> implements MyDeque<E> {
    private E[] elements; // Array que armazena os dados
    private int front; // Indice do PRIMEIRO elemento
    private int rear; // Indice do ULTIMO elemento
    private int count; // Quantos elementos
    private static final int DEFAULT_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public CircularArrayDeque() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        front = 0;
        rear = -1; // -1 significa: deque vazio
        count = 0;
    }

    @Override
    public void addLast(E element) {
        if (count == elements.length) {
            throw new IllegalStateException("Deque cheio");
        }
        rear = (rear + 1) % elements.length;
        elements[rear] = element;
        count++;
    }

    @Override
    public void addFirst(E element) {
        if (count == elements.length) {
            throw new IllegalStateException("Deque cheio");
        }
        front = (front - 1 + elements.length) % elements.length;
        elements[front] = element;
        count++;
        if (count == 1) { // Era o primeiro elemento!
            rear = front; // Sincroniza rear com front
        }
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque vazio");
        }
        E element = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        count--;
        if (count == 0) { // Deque esvaziou: reset canonico
            front = 0;
            rear = -1;
        }
        return element;
    }

    @Override
    public E removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque vazio");
        }
        E element = elements[rear];
        elements[rear] = null;
        rear = (rear - 1 + elements.length) % elements.length;
        count--;
        if (count == 0) { // Deque esvaziou: reset canonico
            front = 0;
            rear = -1;
        }
        return element;
    }

    @Override
    public E peekFirst() {
        if (isEmpty())
            throw new IllegalStateException("Deque vazio");
        return elements[front];
    }

    @Override
    public E peekLast() {
        if (isEmpty())
            throw new IllegalStateException("Deque vazio");
        return elements[rear];
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() { return count; }
}