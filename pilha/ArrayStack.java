public class ArrayStack<E> implements Stack<E> {
    
    private E[] elements;
    private int topIndex;
    private static final int DEFAULT_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        topIndex = -1;
    }

    @Override
    public void push(E element) {
        if (topIndex == elements.length - 1) {
            throw new IllegalStateException("Pilha Cheia");
        }
        topIndex++;
        elements[topIndex] = element;
    }

    @Override
    public E pop () {
        if ( isEmpty () ) {
            throw new IllegalStateException (" Pilha vazia ") ;
        }
        E element = elements [ topIndex ];
        elements [ topIndex ] = null ; // Libera referencia
        topIndex--;
        return element ;
    }

        @Override
    public E top () {
        if ( isEmpty () ) {
            throw new IllegalStateException (" Pilha vazia ") ;
        }      
        return elements [ topIndex ];
    }

    @Override
    public boolean isEmpty () { return topIndex == -1; }
    
    @Override
    public int size () { return topIndex + 1; }
    
}
