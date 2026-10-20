public class SLinkedList<E> implements  MyLinkedList<E> {
    // atributos
    private Node<E> head;
    private Node<E> tail;
    private int size;

    // construtor
    public SLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E first() {
        if (isEmpty()) throw new IllegalStateException();
        return head.getElement();
    }

    @Override
    public E last() {
        if (isEmpty()) throw new IllegalStateException();
        return tail.getElement();
    }

    public Node<E> head() {
        return head;
    }

    @Override
    public void addFirst(E element) {
        Node<E> novo = new Node<>(element, head);
        head = novo;
        if (size == 0) tail = novo;
        size++;
    }

    @Override
    public void addLast(E element) {
        
    }

    @Override
    public E removeFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFirst'");
    }
    
}
