public interface MyQueue<E> {
    void enqueue(E element);
    E dequeue();
    E front();
    boolean isEmpty();
    int size();
}
